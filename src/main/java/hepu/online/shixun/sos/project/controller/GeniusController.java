package hepu.online.shixun.sos.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import hepu.online.shixun.sos.project.model.Adminstor;
import hepu.online.shixun.sos.project.model.Balance;
import hepu.online.shixun.sos.project.model.Loan;
import hepu.online.shixun.sos.project.model.Records;
import hepu.online.shixun.sos.project.model.SystemMessage;
import hepu.online.shixun.sos.project.model.Treasure;
import hepu.online.shixun.sos.project.model.User;
import hepu.online.shixun.sos.project.service.GeniusService;
import hepu.online.shixun.sos.project.util.IndustrySMS;

@Controller
@RequestMapping(value = "/")
public class GeniusController {
	
	private List<Records> fundRecords;// 传到资金记录的集合

	private int pages;// 分页传到JSP的总页数

	private int i = 1;// 分页是第几页

	private int previous;// 分页的上一页的值

	private int next;// 分页的下一页的值

	private Set<Integer> years;// 资金分析传到JSP的年份

	private String yearAndMonth;// 资金分析传到JSP的年月

	private double yearTotalIncome;// 年总收入

	private double yearTotalPay;// 年总支出

	private int year;// 图表显示某年份的数据

	private List<Double> monthIncomes = new ArrayList<Double>();

	private List<Double> monthPays = new ArrayList<Double>();;

	public static String random = null;

	@Autowired
	private GeniusService geniusService;

	/**
	 * 管理员登录
	 * 
	 * @param session
	 * @param adminName
	 * @param adminPassword
	 * @return
	 */
	@RequestMapping(value = "/adminLogin")
	public String adminLogin(HttpSession session, @RequestParam("adminName") String adminName,
			@RequestParam("adminPassword") String adminPassword) {
		List<Adminstor> adminstors = geniusService.getAllAdminstor();
		List<User> users = geniusService.getAllUser();
		session.setAttribute("users", users);
		List<Loan> loans = geniusService.getAllLoan();
		session.setAttribute("loans", loans);
		for (Adminstor adminstor : adminstors) {
			if (adminstor.getAdminstorname().equals(adminName)
					&& adminstor.getAdminstorpassword().equals(adminPassword)) {
				session.setAttribute("adminName", adminstor.getAdminstorname());
				return "views/AdminMain.jsp";

			}
		}
		session.setAttribute("msg", "账户或密码错误");

		return "AdminLogin.jsp";
	}

	/**
	 * 跳转的用户管理页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/toUserManage")
	public String toUserManage(HttpSession session) {
		List<User> users = geniusService.getAllUser();
		session.setAttribute("users", users);
		return "views/userManage.jsp";
	}

	/**
	 * 跳转到贷款申请页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/toProcess")
	public String toProcess(HttpSession session) {
		List<Loan> loans = geniusService.getAllLoan();
		session.setAttribute("loans", loans);
		return "views/process.jsp";
	}

	/**
	 * 跳转到消息推送页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/toInfo")
	public String toInfo() {
		return "views/info.jsp";
	}

	/**
	 * 跳转的首页
	 * 
	 * @return
	 */
	@RequestMapping(value = "/toAdminMain")
	public String toAdminMain() {
		return "views/AdminMain.jsp";
	}

	/**
	 * 锁定用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/lockUser")
	public String lockUser(Model model, @RequestParam("id") int id) {
		boolean result = geniusService.lockUser(id);
		String message = "";
		if (result) {
			message = "锁定成功！";
			model.addAttribute("messagae", message);
			return "views/AdminMain.jsp";

		} else {
			message = "该账户已被锁定";
			model.addAttribute("messagae", message);
			return "views/AdminMain.jsp";
		}

	}

	/**
	 * 解锁用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/unlockUser")
	public String unlockUser(Model model, @RequestParam("id") int id) {
		boolean result = geniusService.unlockUser(id);
		String message = "";
		if (result) {
			message = "锁定成功！";
			model.addAttribute("messagae", message);
			return "views/AdminMain.jsp";

		} else {
			message = "该账户已被锁定";
			model.addAttribute("messagae", message);
			return "views/AdminMain.jsp";
		}
	}

	/**
	 * 通过姓名查询用户
	 * 
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/selectUserByName")
	public String selectUserByName(Model model, @RequestParam("userName") String userName) {
		User user1 = geniusService.selectUserByName(userName);
		if (user1 != null) {
			model.addAttribute("user1", user1);
			return "views/selectUserByName.jsp";
		} else {
			model.addAttribute("message1", "该用户不存在");
			return "views/userManage1.jsp";
		}

	}

	/**
	 * 通过姓名查询申请
	 * 
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/selectLoanByName")
	public String selectLoanByName(Model model, @RequestParam("userName") String userName) {
		Loan loan = geniusService.selectLoanByName(userName);
		if (loan != null) {
			model.addAttribute("loan", loan);
			return "views/selectLoanByName.jsp";
		} else {
			model.addAttribute("message1", "该申请记录不存在");
			return "views/process1.jsp";
		}

	}

	/**
	 * 消息推送
	 * 
	 * @param userName
	 * @return
	 */
	@RequestMapping(value = "/sendMessage")
	public String sendMessage(@RequestParam("userName") String userName, @RequestParam("title") String title,
			@RequestParam("messages") String messages) {
		geniusService.sendMessage(userName, title, messages);
		return "views/AdminMain.jsp";

	}

	/**
	 * 贷款申请处理——同意
	 * 
	 * @return
	 */
	@RequestMapping(value = "/loanProcess")
	public String loanProcess(@RequestParam("id") int id, @RequestParam("loanMoney") double loanMoney,
			@RequestParam("userName") String userName) {
		geniusService.agreeProcess(id, loanMoney, userName);
		return "views/AdminMain.jsp";

	}

	/**
	 * 驳回贷款申请
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/disagreeProcess")
	public String disagreeProcess(@RequestParam("id") int id) {
		geniusService.disagreeProcess(id);
		return "views/AdminMain.jsp";

	}
	// ***************************************************************************/
	// 用户模块

	// 跳转登录页面
	@RequestMapping(value = "/toLogin")
	public String toLogin() {
		return "/index.jsp";
	}

	// 跳转注册跳页面
	@RequestMapping(value = "/toRegister")
	public String toRegister() {

		return "/register.jsp";

	}
    //产生短信验证码随机数
	public static String random(){
		String random = new Random().nextInt(1000000)+"";
		if(random.length()!=6){
			return random();
		}else{
			return random;
		}
	}
	
	@RequestMapping(value = "/sendSms")
	public void sendSms(@RequestParam("phone") String phone,HttpServletResponse response) throws IOException {
		response.setHeader("Content-type", "text/html;charset=UTF-8");
		PrintWriter pw = response.getWriter();
		String random = random();
		System.out.println(phone+"HAHA"+random);
		String to = phone;
		String smsContent = "【SOS理财精灵】您的验证码为"+ random+"，请于+"+"20"+"分钟内正确输入，如非本人操作，请忽略此短信。";
		IndustrySMS.execute(to,smsContent);
		pw.write(random);
	}
	
	// 注册一个用户
	@RequestMapping(value = "/registed")
	public String insertUser(User u) {
		
		
		// 判断用户是否存在
		if (nameJudged(u) == true) {// 用户存在直接返回注册页面
			return "/register.jsp";
		}
		geniusService.insertUser(u);
		return "/index.jsp";
	}

	// 查询所有用户
	public List<User> getAllUser() {
		return geniusService.getAllUser();
	}

	// 查询当前用户
	public List<User> getCurrentUser() {
		return geniusService.getCurrentUser();
	}

	// 判断用户是否存在
	public boolean nameJudged(@ModelAttribute("user") User u) {
		return geniusService.nameJudged(u);
	}

	// 用户登录
	@RequestMapping(value = "/userLogin")
	public String userLogin(@ModelAttribute("user") User u, Model model, HttpSession session) {
		if (geniusService.userLogin(u) == true) {

			List<User> list = getCurrentUser();
			u = list.get(0);

			session.setAttribute("u", u);
			session.setAttribute("userid", u.getId());
			model.addAttribute("list", list);
			return "/main.jsp";
		}
		return "/index.jsp";

	}

	// 用户注销
	@RequestMapping(value = "/clearUser")
	public String clearUser(HttpSession session, @Valid @ModelAttribute("user") User u) {
		session.invalidate();
		geniusService.clearUser(u);
		return "/index.jsp";
	}

	// 跳转余额宝认证界面(若已经认证则跳往余额宝首页)
	@RequestMapping(value = "/toBalanceRegister")
	public String toBalance(User u) {
		boolean result = geniusService.getUserBalance(u);
		if (result == true) {
			return "/balance.jsp";
		}
		return "/balanceRegister.jsp";
	}

	// 余额宝账户认证
	@RequestMapping(value = "/insertUserBalance")
	public String insertUserBalance(User u) {
		boolean result = geniusService.insertUserBalance(u);
		if (result == false) {
			return "/balance.jsp";
		}
		geniusService.insertUserBalance(u);
		return "/balance.jsp";
	}

	// 跳转到银行卡管理界面
	@RequestMapping(value = "/toCardManage")
	public String toCardManager(Model model, Balance b, HttpSession session) {
		if (geniusService.toCardManager(b) == true) {
			session.setAttribute("b", b);
			List<Balance> list = geniusService.getCurrentCard();
			model.addAttribute("list", list);
			return "/cardManage.jsp";
		}
		return null;

	}

	// 跳转添加银行卡页面
	@RequestMapping(value = "/toAddCard")
	public String toAddCard(Balance b) {
		return "/addCard.jsp";

	}

	// 添加银行卡
	@RequestMapping(value = "/addCard")
	public String addCard(Balance b, HttpSession session, Model model) {
		if (geniusService.addCard(b) == true) {
			session.setAttribute("balance", b);
			List<Balance> list = geniusService.getCurrentCard();
			model.addAttribute("list", list);
			return "cardManage.jsp";
		}
		return "toCardManage";

	}

	// 解绑银行卡
	@RequestMapping(value = "/deleteCard")
	public String deleteCard(Balance b, Model model) {
		geniusService.deleteCard(b);
		List<Balance> list = geniusService.getCurrentCard();
		model.addAttribute("list", list);
		return "toCardManage";
	}

	// 判断是否绑定银行卡
	public boolean isCard() {
		boolean result = false;
		if (geniusService.getCurrentCard().size() == 0) {
			return result;
		}
		result = true;
		return result;
	}

	// 跳转到我的钱包
	@RequestMapping(value = "/toMyPurse")
	public String toMyPurse(Model model) {
		List<User> list = getCurrentUser();
		model.addAttribute("list", list);
		return "/myPurse.jsp";

	}

	// 跳转到充值页面
	@RequestMapping(value = "/toRechange")
	public String toRechange(Model model) {
		if (isCard() == false) {
			return "toAddCard";
		}
		List<Balance> list = geniusService.getCurrentCard();
		model.addAttribute("list", list);
		return "rechange.jsp";

	}

	// 跳转到提现页面
	@RequestMapping(value = "/toWithdraw")
	public String toWithdraw(Model model) {
		if (isCard() == false) {
			return "toAddCard";
		}
		List<Balance> list = geniusService.getCurrentCard();
		model.addAttribute("list", list);
		return "/withdraw.jsp";

	}

	// 充值功能
	@RequestMapping(value = "/rechange")
	public String rechange(Balance b) {

		if (geniusService.rechange(b)) {
			return "toMyPurse";
		}
		return "toRechange";

	}

	// 提现功能
	@RequestMapping(value = "/withdraw")
	public String unRechange(Balance b) {

		if (geniusService.unRechange(b)) {
			return "toMyPurse";
		}
		return "withdraw";

	}

	// 跳往余额宝界面
	@RequestMapping(value = "/toYuebao")
	public String toYuebao(Model model) {
		List<Treasure> list = geniusService.getCurrentTreasure();
		if (list.size() == 0) {
			geniusService.insertYuebao();
		}
		model.addAttribute("list", list);
		return "/yuebao.jsp";
	}

	// 跳往余额宝转入页面
	@RequestMapping(value = "/toYuebaoRechange")
	public String toYuebaoRechange(Model model) {
		List<Treasure> list = geniusService.getCurrentTreasure();
		model.addAttribute("list", list);
		return "/yuebaoRechange.jsp";

	}

	// 余额宝转入
	@RequestMapping(value = "/inTreasure")
	public String inTreasure(Treasure t, Model model) {
		if (geniusService.inTreasure(t)) {
			List<Treasure> list = geniusService.getCurrentTreasure();
			model.addAttribute("list", list);
			return "toYuebao";
		}

		return "/yuebaoRechange.jsp";

	}

	// 跳往余额宝转出页面
	@RequestMapping(value = "/toYuebaoWithdraw")
	public String toYuebaoWithdraw(Model model) {
		List<Treasure> list = geniusService.getCurrentTreasure();
		model.addAttribute("list", list);
		return "/yuebaoWithdraw.jsp";

	}

	// 余额宝转出
	@RequestMapping(value = "/outTreasure")
	public String outTreasure(Treasure t, Model model) {
		if (geniusService.outTreasure(t)) {
			List<Treasure> list = geniusService.getCurrentTreasure();
			model.addAttribute("list", list);
			return "toYuebao";
		}

		return "/yuebaoWithdraw.jsp";

	}

	// YQ-C*****************************************************************************/
	/****************
	 * \ 借款模块 * /*
	 *************/
	@RequestMapping(value = "/loan")
	public String loanC(Loan loan) {
		// 查询用户state状态是否为1,为1则等待管理员同意,否则无法借款
		String result = "login.jsp";
		User user = geniusService.getCurrentUser().get(0);
		int a = user.getState();
		if (a == 1) {
			// 向loan表存放数据,等待管理员同意
			/*
			 * Date ddate = null; String sdate = (new
			 * SimpleDateFormat("yyyy-MM-dd")).format(ddate); // 强制将Date转String
			 */ loan.setLoandate("2018-08-24");
			loan.setUsername(user.getUserName());
			geniusService.loanS(loan);
			result = "loanRecord.jsp";
		} else if (a == 0) {// 用户未登陆,返回登录页面
			geniusService.clearUser(user);
		} else if (a == 2) {// 用户已被冻结,提示用户已被冻结无法贷款,并返回主页面
			result = "main.jsp";
		}
		return result;
	}

	// *****************************************************************************/

	/**
	 * 个人信息编辑
	 */
	@RequestMapping(value = "/information")
	public String editInformation(Model model, @RequestParam("userName") String userName, @RequestParam("age") int age,
			@RequestParam("email") String email, @RequestParam("address") String address,
			@RequestParam("sex") String sex, @RequestParam("hobby") String hobby,
			@RequestParam("constellations") String constellations, @RequestParam("occupation") String occupation,
			@RequestParam("company") String company, @RequestParam("labelling") String labelling, HttpSession session) {
		User user = (User) session.getAttribute("u");
		User user1 = geniusService.editInformation(user, userName, age, email, address, sex, hobby, constellations,
				occupation, company, labelling);
		session.setAttribute("u", user1);
		return "PersonalCenter.jsp";
	}

	// **********************************************************/
	/**
	 * 保存用戶姓名及身份證號
	 */
	@RequestMapping(value = "/updateInfo")
	public String updateInfoC(HttpSession session, @RequestParam("userName") String userName,
			@RequestParam("idNumber") String idNumber, @RequestParam("payword") String payword) {
		User user = geniusService.getCurrentUser().get(0);

		geniusService.updateInfoS(userName, idNumber, payword, user.getId());
		session.setAttribute("userName", userName);
		session.setAttribute("idNumber", idNumber);
		session.setAttribute("address", user.getAddress());
		session.setAttribute("sex", user.getSex());
		return "safeInfo.jsp";
	}

	@RequestMapping(value = "/check")
	public String check(HttpSession session) {
		User user = geniusService.getCurrentUser().get(0);
		SystemMessage systemMessage = geniusService.getSystemMessage(user.getUserName());
		session.setAttribute("systemMessage", systemMessage);
		return "check.jsp";
	}
	
	@RequestMapping(value = "/finacialRecord")
	public ModelAndView fundRecord(ModelAndView mav,HttpSession session) {
    
		int showRecords = 8;// 定义每页显示多少条记录。
		String hql = "from Records where user = ?";
		int totalRecords = allfundRecords(session).size();// 得到查询到的记录的总条数。
		if (totalRecords % showRecords == 0) {
			pages = totalRecords / showRecords;// 确定应该有多少页
		} else {
			pages = totalRecords / showRecords + 1;// 确定应该有多少页
		}
		System.out.println(i);
		next = i + 1;
		previous = i - 1;
		/*fundRecords = service.fundRecordShow((i - 1), showRecords, hql, user);*/
		mav = new ModelAndView("/fundRecord.jsp");
		mav.addObject("years", getRecordYears(session));
		return mav;
	}

	@RequestMapping(value = "/finacialAnalysis")
	public String fundAnalysis( Model model ,HttpSession session) {
    
		System.out.println(getRecordYears(session));
		session.setAttribute("years", getRecordYears(session));
		return "/fundAnalysis.jsp";
	}
    
	@RequestMapping(value = "/fundAnalysisData")
	public String getChartData(Model model,@RequestParam("year") int year,
			                         HttpSession session){
		years = getRecordYears(session);// 获取到用户的资金记录的所有年份
		fundRecords = allfundRecords(session);// 得到查询到的记录的集合数
		double monthIncome = 0;
		double monthPay = 0;
		int m = 0;
		System.out.println(year);
		for (Records record : fundRecords) {
			Calendar calYear = Calendar.getInstance();
			calYear.setTime(record.getTradedate());
			while (year == calYear.get(Calendar.YEAR)) {
				// 此部分代码用来获取选中年份的年度总收入和总支出
				if (record.getTradeaccount() > 0) {
					yearTotalIncome += record.getTradeaccount();
				} else {
					yearTotalPay += -record.getTradeaccount();
				}
				// 此部分代码用来获取选中年份每月的总收入和总支出
				Calendar calMonth = Calendar.getInstance();
				calMonth.setTime(record.getTradedate());
				if (m == calMonth.get(Calendar.MONTH)) {
					if (record.getTradeaccount() > 0) {
						monthIncome += record.getTradeaccount();
					} else {
						monthPay += -record.getTradeaccount();
					}
				} else {

					if (m < 11) {
						m++;
					}
					if (m != calMonth.get(Calendar.MONTH)) {
						if (record.getTradeaccount() > 0) {
							monthIncomes.add((double) 0);
						} else {
							monthPays.add((double) 0);
						}
					} else {
						monthIncomes.add(monthIncome);
						monthPays.add(monthPay);
						monthIncome = 0;
						monthPay = 0;
						if (record.getTradeaccount() > 0) {
							monthIncome += record.getTradeaccount();
						} else {
							monthPay += -record.getTradeaccount();
						}
					}
				}
				break;
			}
			if (m ==11) {
				monthIncomes.add(monthIncome);
				monthPays.add(monthPay);
				System.out.println(yearTotalIncome + "" + yearTotalPay);
				System.out.println(monthIncomes);
				System.out.println(monthPays);
				model.addAttribute("yearTotalIncome", yearTotalIncome);
				model.addAttribute("yearTotalPay", yearTotalPay);
				model.addAttribute("monthIncomes", monthIncomes);
				model.addAttribute("monthPays", monthPays);
				return "/fundAnalysis.jsp";
			}
			
		}
		return "/fundAnalysis.jsp";
	}
	// 获取到用户的资金记录的所有年份
	public Set<Integer> getRecordYears(HttpSession session) {
		years = new TreeSet<Integer>();
		fundRecords = allfundRecords(session);// 得到查询到的记录的集合数。 for (Records

		for (Records record : fundRecords) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(record.getTradedate());
			int year = cal.get(Calendar.YEAR);
			years.add(year);
		}
		return years;
	}
	public List<Records> allfundRecords(HttpSession session){
		
		int id = (Integer) session.getAttribute("userid");
		return geniusService.allfundRecords(id);
	}

	public List<Records> getFundRecords() {
		return fundRecords;
	}

	public void setFundRecords(List<Records> fundRecords) {
		this.fundRecords = fundRecords;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getPrevious() {
		return previous;
	}

	public void setPrevious(int previous) {
		this.previous = previous;
	}

	public int getNext() {
		return next;
	}

	public void setNext(int next) {
		this.next = next;
	}

	public Set<Integer> getYears() {
		return years;
	}

	public void setYears(Set<Integer> years) {
		this.years = years;
	}

	public String getYearAndMonth() {
		return yearAndMonth;
	}

	public void setYearAndMonth(String yearAndMonth) {
		this.yearAndMonth = yearAndMonth;
	}

	public double getYearTotalIncome() {
		return yearTotalIncome;
	}

	public void setYearTotalIncome(double yearTotalIncome) {
		this.yearTotalIncome = yearTotalIncome;
	}

	public double getYearTotalPay() {
		return yearTotalPay;
	}

	public void setYearTotalPay(double yearTotalPay) {
		this.yearTotalPay = yearTotalPay;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Double> getMonthIncomes() {
		return monthIncomes;
	}

	public void setMonthIncomes(List<Double> monthIncomes) {
		this.monthIncomes = monthIncomes;
	}

	public List<Double> getMonthPays() {
		return monthPays;
	}

	public void setMonthPays(List<Double> monthPays) {
		this.monthPays = monthPays;
	}

	public GeniusService getGeniusService() {
		return geniusService;
	}

	public void setGeniusService(GeniusService geniusService) {
		this.geniusService = geniusService;
	}

}

package hepu.online.shixun.sos.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hepu.online.shixun.sos.project.dao.AdminstorMapper;
import hepu.online.shixun.sos.project.dao.BalanceMapper;
import hepu.online.shixun.sos.project.dao.LoanMapper;
import hepu.online.shixun.sos.project.dao.RecordsMapper;
import hepu.online.shixun.sos.project.dao.SystemMessageMapper;
import hepu.online.shixun.sos.project.dao.TreasureMapper;
import hepu.online.shixun.sos.project.dao.UserMapper;
import hepu.online.shixun.sos.project.model.Adminstor;
import hepu.online.shixun.sos.project.model.Balance;
import hepu.online.shixun.sos.project.model.Loan;
import hepu.online.shixun.sos.project.model.Records;
import hepu.online.shixun.sos.project.model.SystemMessage;
import hepu.online.shixun.sos.project.model.Treasure;
import hepu.online.shixun.sos.project.model.User;

@Service
public class GeniusService {
	@Autowired
	private BalanceMapper balanceMapper;
	@Autowired
	private TreasureMapper treasureMapper;
	@Autowired
	private AdminstorMapper adminstorMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private SystemMessageMapper systemMessageMapper;
	@Autowired
	private LoanMapper loanMapper;
	@Autowired
	private RecordsMapper recordsMapper;

	/**
	 * 获取所有管理员
	 * 
	 * @return
	 */
	public List<Adminstor> getAllAdminstor() {
		return adminstorMapper.getAllAdminstor();
	}

	/**
	 * 管理员登录
	 * 
	 * @return
	 */
	public List<Adminstor> adminLogin() {
		List<Adminstor> adminstors = getAllAdminstor();

		return adminstors;
	}

	/**
	 * 管理员功能 查询所有用户
	 * 
	 * @return
	 */

	public List<User> getAllUser() {

		List<User> users = userMapper.getAllUser();
		return users;
	}

	/**
	 * 锁定用户
	 * 
	 * @param id
	 */

	public boolean lockUser(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		boolean result = false;
		if (user.getState() != 2) {
			userMapper.lockUserById(id);
			result = true;
		}
		return result;
	}

	public boolean unlockUser(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		boolean result = false;
		if (user.getState() == 2) {
			userMapper.unlockUserById(id);
			result = true;
		}
		return result;

	}

	/**
	 * 通过姓名查询用户
	 * 
	 * @param userName
	 * @return
	 */

	public User selectUserByName(String userName) {
		return userMapper.selectUserByName(userName);
	}

	/**
	 * 消息推送
	 * 
	 * @param userName
	 * @param title
	 * @param messages
	 */

	public void sendMessage(String userName, String title, String messages) {
		systemMessageMapper.sendMessage(userName, title, messages);
	}

	/**
	 * 同意贷款申请
	 * 
	 * @param id
	 */
	public void agreeProcess(int id, double loanMoney, String userName) {
		loanMapper.agreeProcess(id);
		userMapper.addMoney(loanMoney, userName);
	}

	public List<Loan> getAllLoan() {
		List<Loan> loans = loanMapper.getAllLoan();
		return loans;

	}

	/**
	 * 驳回贷款申请
	 * 
	 * @param id
	 */
	public void disagreeProcess(int id) {
		loanMapper.disagreeProcess(id);

	}

	/**
	 * 通过姓名查询申请记录
	 * 
	 * @param userName
	 * @return
	 */

	public Loan selectLoanByName(String userName) {
		// TODO Auto-generated method stub
		return loanMapper.selectLoanByName(userName);
	}

	// *******************************************************************************/
	// 用户模块
	public void insertUser(User u) {
		// 创建一个user对象
		User user = new User(0.0, u.getLoginAccount(), u.getPassword(), 0, "注册成功");
		userMapper.insertUser(user);
		u.setMsg(user.getMsg());
	}

	// 查询当前用户
	public List<User> getCurrentUser() {
		User user = new User();
		user.setState(1);
		List<User> list = userMapper.getCurrentUser(user);
		return list;
	}

	// 判断用户是否存在
	public boolean nameJudged(User u) {
		boolean result = false;
		List<User> list = getAllUser();
		for (User users : list) {
			// 用户存在
			if (users.getLoginAccount().equals(u.getLoginAccount())) {
				u.setMsg("用户已存在!");
				result = true;
				return result;
			}
		}
		u.setMsg("注册成功!");
		return result;
	}

	// 用户登录
	public boolean userLogin(User u) {
		boolean result = false;
		// 获取所有用户
		List<User> list = getAllUser();
		for (User users : list) {
			if (u.getLoginAccount().equals(users.getLoginAccount())
					&& u.getLoginAccount().equals(users.getLoginAccount())) {
				if (users.getState() == 1) {
					User user = new User();
					user.setMsg("该账户已登录!");
					u.setMsg(user.getMsg());
					return result;
				}
				User user = new User(u.getLoginAccount(), 1, "登录成功");
				userMapper.userLogin(user);
				u.setMsg(user.getMsg());
				result = true;
				return result;
			}
		}
		u.setMsg("账户或密码错误");
		return result;
	}

	// 用户注销
	public void clearUser(User u) {
		// 创建一个user对象
		User user = new User(getCurrentUser().get(0).getLoginAccount(), 0, "注销成功");
		userMapper.clearUser(user);
		u.setMsg(user.getMsg());
	}

	// 余额宝账户认证
	public boolean insertUserBalance(User u) {
		boolean result = false;
		if (getUserBalance(u) == true) {// 如果已经认证过则返回值为true
			result = true;
			return result;
		}
		if (isCurrentUer(u) == true) {
			result = true;
			User user = new User(getCurrentUser().get(0).getBalance() * Math.random() * 1 / 10000, 0.0, u.getIdNumber(),
					getCurrentUser().get(0).getLoginAccount(), "认证成功", u.getUserName());
			userMapper.insertUserBalance(user);
			u.setMsg(user.getMsg());
			u.setBalance(user.getBalance());
			return result;
		}
		u.setMsg("输入的不是当前账号");
		return result;
	}

	// 确认是否已经认证
	public boolean getUserBalance(User u) {
		boolean result = false;
		List<User> list = getCurrentUser();
		for (User users : list) {
			if (users.getUserName() != null) {
				result = true;
				u.setLoginAccount(users.getLoginAccount());
				u.setBalance(users.getBalance());
				return result;
			}
		}
		return result;
	}

	// 确认是否输入的是当前账户
	public boolean isCurrentUer(User u) {
		boolean result = false;
		List<User> list = getCurrentUser();
		for (User users : list) {
			if (users.getLoginAccount().equals(u.getLoginAccount()))
				;
			result = true;
			return result;
		}
		return result;
	}

	// 查询当前绑定的银行卡
	public List<Balance> getCurrentCard() {
		Balance balance = new Balance();
		balance.setUser_id(getCurrentUser().get(0).getId());
		List<Balance> list = balanceMapper.getCurrentCard(balance);
		return list;

	}

	// 跳转到银行卡管理界面
	public boolean toCardManager(Balance b) {
		boolean result = true;
		if (getCurrentCard().size() == 0) {// 还没绑定银行卡
			Balance balance = new Balance();
			balance.setMsg("你还没绑定银行卡");
			b.setMsg(balance.getMsg());
			return result;
		}
		return result;
	}

	// 添加银行卡
	public boolean addCard(Balance b) {
		boolean result = false;
		if (isAddCard(b) == true) {
			b.setMsg("该银行卡已绑定");
			return result;
		}
		Balance balance = new Balance(b.getCardNumber(), b.getCardType(), "添加成功", getCurrentUser().get(0).getId());
		balanceMapper.addCard(balance);
		b.setMsg(balance.getMsg());
		result = true;
		return result;
	}

	// 查看银行卡是否已经绑定
	public boolean isAddCard(Balance b) {
		boolean result = false;
		List<Balance> list = getCurrentCard();
		if (list.size() == 0) {// 无银行卡绑定
			return result;
		}
		for (Balance balances : list) {
			if (balances.getCardNumber().equals(b.getCardNumber())) {
				result = true;
				return result;
			}
		}
		return result;

	}

	// 解绑银行卡
	public void deleteCard(Balance b) {
		Balance balance = new Balance();
		balance.setCardNumber(b.getCardNumber());
		balanceMapper.deleteCard(balance);
	}

	// 判断银行卡余额是否足够
	public boolean isEnough(Balance b) {
		boolean result = false;
		for (Balance balances : getCurrentCard()) {
			if (balances.getCardNumber().equals(b.getCardNumber())) {// 查找银行卡
				if (balances.getUserBalance() >= b.getTransfer()) {// 若银行卡余额大于转账金额则返回true
					result = true;
					return result;
				}
			}
		}
		return result;
	}

	// 判断账户余额是否足够
	public boolean isEnough1(Balance b) {
		boolean result = false;
		for (Balance balances : getCurrentCard()) {
			if (balances.getCardNumber().equals(b.getCardNumber())) {// 查找银行卡
				if (getCurrentUser().get(0).getBalance() >= b.getIncome()) {// 若账户余额大于提现金额则返回true
					result = true;
					return result;
				}
			}
		}
		return result;
	}

	// 用户充值
	public boolean rechange(Balance b) {
		boolean result = false;
		if (isEnough(b)) {// 银行卡余额足够
			for (Balance balances : getCurrentCard()) {
				if (balances.getCardNumber().equals(b.getCardNumber())) {
					Balance balance = new Balance();
					// 银行卡的余额等于原本金额减去充值金额
					balance.setUserBalance(balances.getUserBalance() - b.getTransfer());
					balance.setCardNumber(b.getCardNumber());
					balanceMapper.rechange(balance);
					User user = new User();
					// 账户余额等于原本金额加上充值金额
					user.setBalance(getCurrentUser().get(0).getBalance() + b.getTransfer());
					user.setLoginAccount(getCurrentUser().get(0).getLoginAccount());
					userMapper.rechange(user);
					result = true;
					return result;
				}
			}
		}
		return result;

	}

	// 用户提现
	public boolean unRechange(Balance b) {
		boolean result = false;
		if (isEnough1(b)) {// 账户余额足够
			for (Balance balances : getCurrentCard()) {
				if (balances.getCardNumber().equals(b.getCardNumber())) {
					Balance balance = new Balance();
					// 银行卡的余额等于原本金额减去充值金额
					balance.setUserBalance(balances.getUserBalance() + b.getIncome());
					balance.setCardNumber(b.getCardNumber());
					balanceMapper.unRechange(balance);
					User user = new User();
					// 账户余额等于原本金额加上充值金额
					user.setBalance(getCurrentUser().get(0).getBalance() - b.getIncome());
					user.setLoginAccount(getCurrentUser().get(0).getLoginAccount());
					userMapper.unRechange(user);
					result = true;
					return result;
				}
			}
		}
		return result;
	}

	// 获得当前用户余额宝账户的信息
	public List<Treasure> getCurrentTreasure() {
		Treasure treasure = new Treasure();
		treasure.setUser_id(getCurrentUser().get(0).getId());
		List<Treasure> list = treasureMapper.getCurrentTreasure(treasure);
		return list;

	}

	// 若余额宝不存在账号则会在首次跳转的时候生成一个账号
	public void insertYuebao() {
		Treasure treasure = new Treasure(0, 0, 0, 0, 0, 0, 0, getCurrentUser().get(0).getId());
		treasureMapper.insertYuebao(treasure);

	}

	// 判断账户余额是否足够
	public boolean isEnough2(Treasure t) {
		boolean result = false;
		for (User users : getCurrentUser()) {
			if (users.getBalance() > t.getInMoney()) {
				result = true;
				return result;
			}
		}
		return result;

	}

	// 判断余额宝余额是否足够
	public boolean isEnough3(Treasure t) {
		boolean result = false;
		for (Treasure treasures : getCurrentTreasure()) {
			if (treasures.getTotalMoney() > t.getOutMoney()) {
				result = true;
				return result;
			}
		}
		return result;

	}

	// 余额宝转入
	public boolean inTreasure(Treasure t) {
		boolean result = false;
		if (isEnough2(t)) {
			for (Treasure treasures : getCurrentTreasure()) {
				Treasure treasure = new Treasure(treasures.getTotalMoney() + t.getInMoney(),
						treasures.getAbleMoney() + t.getInMoney(), treasures.getDisableMoney(),
						treasures.getInMoney() + t.getInMoney() - treasures.getOutMoney(),
						(treasures.getInMoney() + t.getInMoney() - treasures.getOutMoney()) / 365);
				treasureMapper.inTreasure(treasure);
				User user = new User();
				user.setBalance(getCurrentUser().get(0).getBalance() - t.getInMoney());
				user.setLoginAccount(getCurrentUser().get(0).getLoginAccount());
				userMapper.inTreasure(user);
				result = true;
				return result;
			}
		}
		return result;
	}

	// 余额宝转出
	public boolean outTreasure(Treasure t) {
		boolean result = false;
		if (isEnough2(t)) {
			for (Treasure treasures : getCurrentTreasure()) {
				Treasure treasure = new Treasure(treasures.getTotalMoney() - t.getOutMoney(),
						treasures.getAbleMoney() - t.getOutMoney(), treasures.getDisableMoney(),
						treasures.getInMoney() - treasures.getOutMoney() - t.getOutMoney(),
						(treasures.getInMoney() - treasures.getOutMoney() - t.getOutMoney()) / 365);
				treasureMapper.inTreasure(treasure);
				User user = new User();
				user.setBalance(getCurrentUser().get(0).getBalance() + t.getOutMoney());
				user.setLoginAccount(getCurrentUser().get(0).getLoginAccount());
				userMapper.outTreasure(user);
				result = true;
			}
		}
		return result;
	}

	/*
	 * YQ-S开始
	 ******************************************************************************************/
	/**
	 * 存放loan表的数据
	 */
	public void loanS(Loan loan) {
		loanMapper.insertLoan(loan);
	}

	public User editInformation(User user, String userName, int age, String email, String address, String sex,
			String hobby, String constellations, String occupation, String company, String labelling) {
		user.setUserName(userName);
		user.setAge(age);
		user.setEmail(email);
		user.setAddress(address);
		user.setSex(sex);
		user.setHobby(hobby);
		user.setConstellations(constellations);
		user.setOccupation(occupation);
		user.setCompany(company);
		user.setLabelling(labelling);
		userMapper.editInformation(user);
		return user;

	}

	public void updateInfoS(String userName,String idNumber,String payword,int id) {
		userMapper.updateInfo(userName,idNumber,payword,id);
	}

	public SystemMessage getSystemMessage(String userName) {
		SystemMessage systemMessage =systemMessageMapper.getSystemMessage(userName);
		return systemMessage;
		// TODO Auto-generated method stub
		
	}
	
	public List<Records> allfundRecords(int id) {

		List<Records> fundRecords =recordsMapper.allfundRecords(id);
		return fundRecords;
	}
}

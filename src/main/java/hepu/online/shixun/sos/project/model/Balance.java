package hepu.online.shixun.sos.project.model;

public class Balance {
 
	private long id;
	private double income;
	private double transfer;
	private double userBalance;
	private String cardNumber;
	private String cardPwd;
	private String cardType;
	private String msg;
	private int user_id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getTransfer() {
		return transfer;
	}
	public void setTransfer(double transfer) {
		this.transfer = transfer;
	}
	public double getUserBalance() {
		return userBalance;
	}
	public void setUserBalance(double userBalance) {
		this.userBalance = userBalance;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardPwd() {
		return cardPwd;
	}
	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Balance(String cardNumber, String cardType, String msg, int user_id) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.msg = msg;
		this.user_id = user_id;
	}
	public Balance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

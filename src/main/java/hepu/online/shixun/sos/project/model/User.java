package hepu.online.shixun.sos.project.model;

import java.io.Serializable;

public class User implements Serializable {

	private int id;

	private double profit;

	private Double balance;

	private String email;

	private String idNumber;

	private Double income;

	private String loginAccount;

	private String nickName;

	private String cardNumber;

	private String password;

	private String payword;

	private String sex;

	private Integer state;

	private String msg;

	private String userName;

	private int age;

	private String address;

	private String hobby;

	private String constellations;

	private String occupation;

	private String company;
	
	private String labelling;
	
	public User(String loginAccount, Integer state, String msg) {
		super();
		this.loginAccount = loginAccount;
		this.state = state;
		this.msg = msg;
	}
	public User(Double balance, String loginAccount, String password, Integer state, String msg) {
		super();
		this.balance = balance;
		this.loginAccount = loginAccount;
		this.password = password;
		this.state = state;
		this.msg = msg;
	}

	public User(double profit, Double balance, String idNumber, String loginAccount, String msg, String userName) {
		super();
		this.profit = profit;
		this.balance = balance;
		this.idNumber = idNumber;
		this.loginAccount = loginAccount;
		this.msg = msg;
		this.userName = userName;
	}

	public User(int id, String userName, int age, String email, String address, String sex, String hobby,
			String constellations, String occupation, String company, String labelling) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.email = email;
		this.address = address;
		this.sex = sex;
		this.hobby = hobby;
		this.constellations = constellations;
		this.occupation = occupation;
		this.company = company;
		this.labelling = labelling;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getPayword() {
		return payword;
	}

	public void setPayword(String payword) {
		this.payword = payword == null ? null : payword.trim();
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getLoginAccount() {
		return loginAccount;
	}

	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getConstellations() {
		return constellations;
	}

	public void setConstellations(String constellations) {
		this.constellations = constellations;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLabelling() {
		return labelling;
	}

	public void setLabelling(String labelling) {
		this.labelling = labelling;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

}
package hepu.online.shixun.sos.project.model;

public class Treasure {

	private long id;
	
	private double totalMoney;
	
	private double ableMoney;
	
	private double outMoney;
	
	private double inMoney;
	
	private double disableMoney;
	
	private double totalProfit;
	
	private double dayProfit;

	private int user_id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	public double getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(double totalMoney) {
		this.totalMoney = totalMoney;
	}

	public double getAbleMoney() {
		return ableMoney;
	}

	public void setAbleMoney(double ableMoney) {
		this.ableMoney = ableMoney;
	}

	public double getOutMoney() {
		return outMoney;
	}

	public void setOutMoney(double outMoney) {
		this.outMoney = outMoney;
	}

	public double getInMoney() {
		return inMoney;
	}

	public void setInMoney(double inMoney) {
		this.inMoney = inMoney;
	}

	public double getDisableMoney() {
		return disableMoney;
	}

	public void setDisableMoney(double disableMoney) {
		this.disableMoney = disableMoney;
	}

	public double getTotalProfit() {
		return totalProfit;
	}

	public void setTotalProfit(double totalProfit) {
		this.totalProfit = totalProfit;
	}

	public double getDayProfit() {
		return dayProfit;
	}

	public void setDayProfit(double dayProfit) {
		this.dayProfit = dayProfit;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Treasure(double totalMoney, double ableMoney, double disableMoney, double totalProfit, double dayProfit) {
		super();
		this.totalMoney = totalMoney;
		this.ableMoney = ableMoney;
		this.disableMoney = disableMoney;
		this.totalProfit = totalProfit;
		this.dayProfit = dayProfit;
	}
    
	

	public Treasure(double totalMoney, double ableMoney, double outMoney, double inMoney, double disableMoney,
			double totalProfit, double dayProfit, int user_id) {
		super();
		this.totalMoney = totalMoney;
		this.ableMoney = ableMoney;
		this.outMoney = outMoney;
		this.inMoney = inMoney;
		this.disableMoney = disableMoney;
		this.totalProfit = totalProfit;
		this.dayProfit = dayProfit;
		this.user_id = user_id;
	}

	public Treasure() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}

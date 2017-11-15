package hepu.online.shixun.sos.project.model;

import java.io.Serializable;

public class Loan implements Serializable{
    private Integer id;

    private Double loanmoney;

    private String loandate;

    private String repayment;

    private String username;
    
    private Integer processState;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getLoanmoney() {
		return loanmoney;
	}

	public void setLoanmoney(Double loanmoney) {
		this.loanmoney = loanmoney;
	}

	public String getLoandate() {
		return loandate;
	}

	public void setLoandate(String loandate) {
		this.loandate = loandate;
	}

	public String getRepayment() {
		return repayment;
	}

	public void setRepayment(String repayment) {
		this.repayment = repayment;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getProcessState() {
		return processState;
	}

	public void setProcessState(Integer processState) {
		this.processState = processState;
	}


}
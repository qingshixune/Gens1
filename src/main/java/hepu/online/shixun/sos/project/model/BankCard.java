package hepu.online.shixun.sos.project.model;

public class BankCard {
    private Integer id;

    private Double balance;

    private String cardname;

    private String cardnum;

    private Integer cardpwd;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCardname() {
        return cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname == null ? null : cardname.trim();
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum == null ? null : cardnum.trim();
    }

    public Integer getCardpwd() {
        return cardpwd;
    }

    public void setCardpwd(Integer cardpwd) {
        this.cardpwd = cardpwd;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
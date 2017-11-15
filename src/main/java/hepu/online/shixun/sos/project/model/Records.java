package hepu.online.shixun.sos.project.model;

import java.util.Date;

public class Records {
    private Integer id;

    private Double tradeaccount;

    private Date tradedate;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTradeaccount() {
        return tradeaccount;
    }

    public void setTradeaccount(Double tradeaccount) {
        this.tradeaccount = tradeaccount;
    }

    public Date getTradedate() {
        return tradedate;
    }

    public void setTradedate(Date tradedate) {
        this.tradedate = tradedate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
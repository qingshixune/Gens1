package hepu.online.shixun.sos.project.model;

public class Friends {
    private Long id;

    private String friendaccount;

    private Integer userid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFriendaccount() {
        return friendaccount;
    }

    public void setFriendaccount(String friendaccount) {
        this.friendaccount = friendaccount == null ? null : friendaccount.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
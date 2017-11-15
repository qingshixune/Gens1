package hepu.online.shixun.sos.project.model;

public class Adminstor {
    private Integer id;

    private String adminstorname;

    private String adminstorpassword;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminstorname() {
        return adminstorname;
    }

    public void setAdminstorname(String adminstorname) {
        this.adminstorname = adminstorname == null ? null : adminstorname.trim();
    }

    public String getAdminstorpassword() {
        return adminstorpassword;
    }

    public void setAdminstorpassword(String adminstorpassword) {
        this.adminstorpassword = adminstorpassword == null ? null : adminstorpassword.trim();
    }
}
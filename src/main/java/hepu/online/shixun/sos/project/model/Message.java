package hepu.online.shixun.sos.project.model;

public class Message {
    private Long id;

    private String messages;

    private String receptionname;

    private String sendname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages == null ? null : messages.trim();
    }

    public String getReceptionname() {
        return receptionname;
    }

    public void setReceptionname(String receptionname) {
        this.receptionname = receptionname == null ? null : receptionname.trim();
    }

    public String getSendname() {
        return sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname == null ? null : sendname.trim();
    }
}
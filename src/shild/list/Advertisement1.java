package shild.list;

import java.util.Date;

public class Advertisement1 {
    private String title;//vernagir
    private String type;
    private String address;
    private Date createData;
    private User user;

    public Advertisement1(String title, String type, String address, Date createData, User user) {
        this.title = title;
        this.type = type;
        this.address = address;
        this.createData = createData;
        this.user = user;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateData() {
        return createData;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Advertisement1{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", createData=" + createData +
                ", user=" + user +
                '}';
    }
}

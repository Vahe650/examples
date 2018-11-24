package shild.listam.model;

import java.util.Date;

public class Advertisment {
    private String title;
    private String desc;
    private String type;
    private double price;
    private Date createdDate;
    private User user;

    public Advertisment() {
    }

    public Advertisment(String title, String desc, String type, double price, Date createdDate, User user) {
        this.title = title;
        this.desc = desc;
        this.type = type;
        this.price = price;
        this.createdDate = createdDate;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Advertisment{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", createdDate=" + createdDate +
                ", user=" + user +
                '}';
    }
}

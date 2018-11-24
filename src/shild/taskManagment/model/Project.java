package shild.taskManagment.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Project implements Serializable {
    private String name;
    private double price;
    private Date startDate;
    private Date endedDate;

    public Project(String name, double price, Date startDate, Date endedDate) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endedDate = endedDate;
    }

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndedDate() {
        return endedDate;
    }

    public void setEndedDate(Date endedDate) {
        this.endedDate = endedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (Double.compare(project.price, price) != 0) return false;
        if (name != null ? !name.equals(project.name) : project.name != null) return false;
        if (startDate != null ? !startDate.equals(project.startDate) : project.startDate != null) return false;
        return endedDate != null ? endedDate.equals(project.endedDate) : project.endedDate == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endedDate != null ? endedDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        return "Project{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", startDate=" +sdf.format(startDate)+
                ", endedDate=" + sdf.format(endedDate)+
                '}';
    }
}

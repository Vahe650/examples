package shild.taskManagment.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Serializable{
    private String title;
    private String desc;
    private long estimate;
    private String assignTo;
    private Date createdDate;
    private String status;
    private Project project;

    public Task() {
    }

    public Task(String title, String desc, long estimate, String assignTo, Date createdDate, String status, Project project) {
        this.title = title;
        this.desc = desc;
        this.estimate = estimate;
        this.assignTo = assignTo;
        this.createdDate = createdDate;
        this.status = status;
        this.project = project;
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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public long getEstimate() {
        return estimate;
    }

    public void setEstimate(long estimate) {
        this.estimate = estimate;
    }

    public String getAssignTo() {
        return assignTo;
    }

    public void setAssignTo(String assignTo) {
        this.assignTo = assignTo;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        if (estimate != task.estimate) return false;
        if (title != null ? !title.equals(task.title) : task.title != null) return false;
        if (desc != null ? !desc.equals(task.desc) : task.desc != null) return false;
        if (assignTo != null ? !assignTo.equals(task.assignTo) : task.assignTo != null) return false;
        if (createdDate != null ? !createdDate.equals(task.createdDate) : task.createdDate != null) return false;
        if (status != null ? !status.equals(task.status) : task.status != null) return false;
        return project != null ? project.equals(task.project) : task.project == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (int) (estimate ^ (estimate >>> 32));
        result = 31 * result + (assignTo != null ? assignTo.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (project != null ? project.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        return "Task{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", estimate=" + estimate +
                ", assignTo='" + assignTo + '\'' +
                ", createdDate=" + sdf.format(createdDate) +
                ", status='" + status + '\'' +
                ", project=" + project +
                '}';
    }
}

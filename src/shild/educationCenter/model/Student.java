package shild.educationCenter.model;

import java.util.Arrays;
import java.util.Date;

public class Student {

    private String name;
    private String surname;
    private String phone;
    private String email;
    private Date registeredDate;
    private Lesson[] lessons;

    public Student(String name, String surname, String phone, String email, Date registeredDate, Lesson[] lessons) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
        this.registeredDate = registeredDate;
        this.lessons = lessons;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", registeredDate=" + registeredDate +
                ", lessons=" + Arrays.toString(lessons) +
                '}';
    }
}
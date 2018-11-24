package dateImmutable;

import java.util.Date;

final public class ImmutableDate {
    final private  String name;
    final private String surnam;
    final  private int age;
    final private Date date;

    public ImmutableDate(String name, String surnam, int age, Date date) {
        this.name = name;
        this.surnam = surnam;
        this.age = age;
        this.date = new Date();
        this.date.setTime(this.date.getTime());
    }
    public static ImmutableDate createNewInstance(String name, String surnam, int age, Date date) {
        return new ImmutableDate (name, surnam,age,date);
    }

    public String getName() {
        return name;
    }

    public String getSurnam() {
        return surnam;
    }

    public int getAge() {
        return age;
    }

    public Date getDate() {
        Date d=new Date();
        d.setTime(date.getTime());
        return d;
    }

    @Override
    public String toString() {
        return "ImmutableDate{" +
                "name='" + name + '\'' +
                ", surnam='" + surnam + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImmutableDate that = (ImmutableDate) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surnam != null ? !surnam.equals(that.surnam) : that.surnam != null) return false;
        return date != null ? date.equals(that.date) : that.date == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surnam != null ? surnam.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}

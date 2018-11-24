package shild.library;

public class Autor1 {
    String name;
    String surname;
    int age;
    Autor1(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Autor1{"+"name="+name+"/"+",surname="+surname+"/"+",age="+age+'}';

}
}

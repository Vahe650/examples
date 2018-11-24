package chapter9.ex4;

public class Class2 extends Class1 {
    void method(){
        System.out.println("Class2");
    }
    static void stat(Class1 class1){
        class1.method();
    }

    public static void main(String[] args) {
        Class2 c=new Class2();
        Class2.stat(c);
    }
}

package chapter10.ex18;

public interface InterfaceNestedClass {
    void method();
    class Nested{
        String string;
    }
}
class Test implements InterfaceNestedClass{
    @Override
    public void method() {
        System.out.println("Cool method");
    }

    public static void main(String[] args) {
        Nested nested=new Nested();
        System.out.println(nested.string = "Cool Field");
        Test test =new Test();
        test.method();

    }
}

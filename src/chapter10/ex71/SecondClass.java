package chapter10.ex71;

public class SecondClass implements SecondInterface {


    @Override
    public SecondInterface si() {
                System.out.println("Class Was Created");
        return new SecondClass();
    }

    public static void main(String[] args) {
        SecondClass sc=new SecondClass();
        sc.si();

    }
}

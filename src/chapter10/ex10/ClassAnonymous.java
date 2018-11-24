package chapter10.ex10;

public class ClassAnonymous {
    public InterfaceOneMeth oneMeth(){
        return new InterfaceOneMeth() {
            @Override
            public void f() {
                System.out.println("Anonim Class");
            }
        };
    }

    public static void main(String[] args) {
        ClassAnonymous ca=new ClassAnonymous();
        InterfaceOneMeth interfaceOneMeth = ca.oneMeth();
        interfaceOneMeth.f();
    }
}

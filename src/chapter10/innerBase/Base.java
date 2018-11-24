package chapter10.innerBase;

public abstract class Base {
    public Base(int i) {
        System.out.println("Base Constructor, i = " + i);
    }
    public abstract void f();
}
 class AnonymousCOntructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("v inicializatre exemplyara");
            }
            @Override
            public void f() {
                System.out.println("v anonimnom f()");
            }
        };
    }
    public static void main(String[] args) {
        Base base=getBase(47);
        base.f();
    }
}

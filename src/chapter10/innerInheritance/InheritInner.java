package chapter10.innerInheritance;

class WithInner {
    class Inner {
        public Inner() {
            System.out.println("inner class");
        }
    }
}

public class InheritInner extends WithInner.Inner {
    public InheritInner(WithInner withInner) {
        withInner.super();
    }


    public static void main(String[] args) {
        WithInner withInner=new WithInner();
        InheritInner ii=new InheritInner(withInner);


    }
}
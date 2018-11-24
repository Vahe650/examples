package chapter10.ex71;

public class ImplementsClass {
    public OneMethodInterface createInnerClass(){
        class InnerImplements implements OneMethodInterface{

            @Override
            public void oneMethod() {
                System.out.println("Class created");
            }
        }
        return new InnerImplements();
    }

    public static void main(String[] args) {
        ImplementsClass ic=new ImplementsClass();
        OneMethodInterface innerClass = ic.createInnerClass();
        innerClass.oneMethod();

    }

}

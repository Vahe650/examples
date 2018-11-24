package chapter10.ex7;

public class PrivateMethodAndField {
    private String name;
    public String surname;

    public void setName(String name) {
        this.name = name;

    }

    private String getName() {
        return name;
    }

    private String callInnerMethod(PrivateMethodAndField p) {
        InnerClass innerClass = new InnerClass();
        innerClass.alter(p);
        return this.name;
    }
    class InnerClass {
        String innerName;
        public String alter(PrivateMethodAndField p) {
            p.setName("Vag");
            return p.getName();
        }
        public PrivateMethodAndField pm() {
            return new PrivateMethodAndField();
        }
    }
    public static void main(String[] args) {
        InnerClass innerClass = new PrivateMethodAndField().new InnerClass();
        PrivateMethodAndField p = innerClass.pm();
        PrivateMethodAndField pf=new PrivateMethodAndField();
        p.setName("Styop");
        System.out.println(p.getName());
        System.out.println(p.callInnerMethod(p));
        innerClass.alter(p);
        System.out.println(p.getName());

    }
}

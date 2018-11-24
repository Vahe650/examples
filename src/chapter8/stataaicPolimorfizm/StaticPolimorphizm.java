package chapter8.stataaicPolimorfizm;

class StaticSuper {
    public static String staticGet() {
        return "bazoviy staticGEt()";
    }

    public String dynamicGet() {
        return "bazoviy dynamicGet()";
    }
}
class StaticSub extends StaticSuper{
    public static String staticGet()
    {
        return "proizvodniy staticGet()";
    }
    public String dynamicGet() {
        return "proizvodniy dynamicGet()";
    }

}


public class StaticPolimorphizm {
    public static void main(String[] args) {
        StaticSuper staticSuper=new StaticSub();//upcasting
        System.out.println(staticSuper.dynamicGet());
        System.out.println(staticSuper.staticGet());
        System.out.println(StaticSub.staticGet());
    }
}

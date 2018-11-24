package chapter10.dotNew;

public class DotNew {
    class InnerNew{

    }

    public static void main(String[] args) {
        DotNew dn=new DotNew();
        DotNew.InnerNew dni=dn.new InnerNew();
    }
}

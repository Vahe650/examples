package chapter8.transMogriphy;
class Useful{
    public void f(){}
    public void g(){}
}
class MoreUseFul extends Useful{
    public void f(){}
    public void g(){}
    public void u(){}
    public void v(){}
    public void w(){}

}

public class RTTI {
    public static void main(String[] args) {
        Useful[] x={new Useful(),new MoreUseFul()};
        x[0].f();
        x[1].g();
        //stadiya kompilyacii:metod ne nayden v klass Useful;
        try {
            ((MoreUseFul) x[1]).u();//nisXodyashee preobrazovanie
            ((MoreUseFul) x[0]).u();//proisxodit Exceptoin ClassCast
        }catch (ClassCastException e){
            System.out.println("hop hop axpers");
        }

    }
}

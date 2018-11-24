package chapter10.callBacks;

interface Incrementable{
    void incrementable();
}
class Call1 implements Incrementable{
    private int i=0;
    @Override
    public void incrementable() {
        i++;
        System.out.println(i);
    }
}
class MyIncrement{

    public void myIncrement(){
        System.out.println("drugaya operaciya");
    }

    public static void f(MyIncrement mi){
        mi.myIncrement();
    }
}
class Call2 extends MyIncrement{
    private int i=0;
    public void myIncrement(){
        super.myIncrement();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable{

        @Override
            public void incrementable() {
            //aystex kanchvum e artaqin klassi metody
            //aylapes texi kunena anverj rekursia
            Call2.this.myIncrement();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();

    }
}
class Caller{
    private Incrementable cbh;
    Caller(Incrementable cbh){
        this.cbh=cbh;
    }
    void go(){
        cbh.incrementable();
    }
}
public class CallBack {
    public static void main(String[] args) {
        Call1 c1=new Call1();
        Call2 c2=new Call2();
        MyIncrement.f(c2);
        Caller caller1=new Caller(c1);
        Caller caller2=new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();

    }









}

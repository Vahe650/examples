package chapter10.dotThis;

public class DotThis {
    private int i;
    private void f(){
        System.out.println("DotThis.f()"+i++);



    }
    public class DotThisInner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public DotThisInner inner(){
        return new DotThisInner();
    }

    public static void main(String[] args) {
        DotThis dt=new DotThis();
        DotThis.DotThisInner dti=dt.inner();
        dti.outer().f();
        dti=dt.new DotThisInner();
        dti.outer().f();

    }
}

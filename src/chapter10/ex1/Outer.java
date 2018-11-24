package chapter10.ex1;

import chapter10.dotThis.DotThis;

public class Outer {
    private String xoxo;

    public Outer(String xoxo) {
        this.xoxo = xoxo;
    }

    public  Inner getInner(){
        return new Inner();
    }



    public  class Inner{
      public   void doGet(){
            System.out.println("doGet ");
        }
        @Override
        public String toString() {
            return "Inner{" +
                    "xoxo='" + xoxo + '\'' +
                    '}';
        }

    }


    public static void main(String[] args) {
        Outer outer=new Outer("Artemis");
        Inner inner=outer.getInner();
        System.out.println(inner);
        DotThis dotThis=new DotThis();
        DotThis.DotThisInner de=dotThis.new DotThisInner();

    }
}

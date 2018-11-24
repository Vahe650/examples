package dateImmutable;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //   ImmutableDate newInstance = ImmutableDate.createNewInstance("anun", "azganun", 30, new Date());

Date d=new Date();
d.setTime(999999999);
        ImmutableDate e = new ImmutableDate("anun", "azganun", 30,d);
        e.getDate().setTime(12222);
        System.out.println(e.getDate().getTime()+"  e.getDate");

        System.out.println(e);
        System.out.println(d.getTime()+"    d.GetTime");
        System.out.println(ImmutableDate.createNewInstance("abo", "gevorgyan", 85, d));
    }
}

package shild.collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //stexcel tsaranman havaqacu TreeSet tipi
        TreeSet<String>ts=new TreeSet<String>();
        //avelacnel elementner
        ts.add("c");
        ts.add("a");
        ts.add("b");
        ts.add("e");
        ts.add("f");
        ts.add("d");
        //verji element@ chi tpvi qani vor Set@ bacarum e duplikatner@
        ts.add("d");
        System.out.println(ts);
        //subSet metod@ ktpi mijakayqum gtnvox elementner@
        System.out.println(ts.subSet("b","f"));
    }
}

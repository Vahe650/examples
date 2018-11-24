package shild.collections;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        //stexcel HashMap
        HashMap<String,Double> hm =new HashMap<String, Double>();
        //avelacnel elementner
        hm.put("Armen",new Double(3434.3444));
        hm.put("krmen",new Double(34354.346));
        hm.put("Arman",new Double(34348.349));
        hm.put("Armenia",new Double(343874.347));
        hm.put("Armenoid",new Double(-343420.384));
        //stanal ttvyalneri havaqacu
        Set<Map.Entry<String,Double>> set=hm.entrySet();
        //tpel havaqacun
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey()+" ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //armeni hashvin mtcnel 1000 dram
        double balance=hm.get("Armen");
        hm.put("Armen",balance+1000);
        System.out.println("Armeni verjnakan hashivn e: "+hm.get("Armen"));









    }
}

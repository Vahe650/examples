package shild.collections;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        // sarqel massivneri cank
        ArrayList<String>a1=new ArrayList<String>();
        System.out.println("massivi skzbnakan chap@ "+a1.size());
        //avelacnel massivum elementner
        a1.add("C");
        a1.add("a");
        a1.add("e");
        a1.add("b");
        a1.add("d");
        a1.add("f");
        a1.add(1,"a2");
        System.out.println("massivi chap element avelacneluc heto "+ a1.size());
        //tpel masivi cank@
        System.out.println("a1 massivi parunakutyun@ "+a1);
        //jnjel cankic element
        a1.remove("f");
        a1.remove(2);
        System.out.println("masivi chap@ jnjeluc heto "+a1.size());
        System.out.println("masivi parunakutyun@ "+a1);
    }
}

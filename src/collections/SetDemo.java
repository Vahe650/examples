package collections;

import classConstructor.millain.Villain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Short> s=new HashSet<>();
        s.add((short) 5);
        s.add((short) 6);
        s.add((short) 6);
        s.add((short) 6);
        s.add((short) 6);
        s.add((short) 6);
//        s.remove((short)5);
//        s.remove((short)6);
        System.out.println(s);
        ArrayList<Short> arrayList=new ArrayList(s);
        arrayList.add(2, (short) 8);
        arrayList.add(2, (short) 8);
        arrayList.add(2, (short) 8);
        arrayList.add(2, (short) 8);
        System.out.println(arrayList.get(2)+"sdasd");
        arrayList.remove(2);
        arrayList.remove(2);
        arrayList.remove(2);
        System.out.println(arrayList);



    }
}

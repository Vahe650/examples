package shild.collections;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        //avelacnel elementner massivi cankum
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println("massivi parunakutyun@ " + a1);
        //dardznel sovorakan massiv
        Integer ia[] = new Integer[a1.size()];
        ia = a1.toArray(ia);
        int sum = 0;
        //gumarel elementner@
        for (int i : ia) {
            sum += i;
            System.out.println("gumar@ = " + i + ": " + sum);
        }
    }
}
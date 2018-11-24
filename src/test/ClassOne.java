package test;

import java.util.Arrays;

public class ClassOne {
    public static void main(String[] args) {
        int ints = 123;
        String s1 = Integer.toString(ints);
        int sum = s1.chars().sum();
        System.out.println(sum);
        int a = 10;
        int b = 16;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
        Float f = new Float("3.0");
        int q = f.intValue();
        byte w = f.byteValue();
        double d = f.doubleValue();
        int a1;
        System.out.println(q + w + d);

    }
}




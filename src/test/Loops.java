package test;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        int t = 5;
        int k = 0;
        for (int i = 0; i < t; i++) {
            int a = 5;
            int b = 3;
            if (k <= 1)
                k++;
            else k *= k;
            int n=a + k * b;
            System.out.println(n+k*b);


        }

    }
}


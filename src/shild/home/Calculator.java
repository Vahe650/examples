package shild.home;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Scanner calc=new Scanner(System.in);
        int a=calc.nextInt();
        int b = calc.nextInt();
        int sum=a*b;
        System.out.println(sum);



    }
}

package shild.home;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        System.out.println("please enter your AMD");
        Scanner s=new Scanner(System.in);
        int AMD=s.nextInt();
        int USD= AMD/480;
        System.out.println("you have "+USD+" USD");
    }
}

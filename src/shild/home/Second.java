package shild.home;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("please enter day count");
        Scanner day=new Scanner(System.in);
        int days=day.nextInt();
        int minute=days*24*60;
        int second=days*24*60*60;
        System.out.println(days+" days are have "+minute+" minute and "+second+" second ");
    }
}

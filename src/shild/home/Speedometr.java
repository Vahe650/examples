package shild.home;

import java.util.Scanner;

public class Speedometr {
    public static void main(String[] args) {
        System.out.println("enter KM and time");
        Scanner scanner=new Scanner(System.in);
        int km=scanner.nextInt();
        int tm=scanner.nextInt();
        int kmh=km/tm;
        System.out.println("you need to go "+kmh+" km/h");
    }
}

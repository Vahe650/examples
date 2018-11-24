package shild.home;

import java.util.Scanner;

public class Voice {
    public static void main(String[] args) {


    /*Расчет расстояния до места удара молнии.
    Звук в воздухе распространяется со скоростью
    приблизительно равной 1100 футам в секунду.
    Зная интервал времени между вспышкой молнии и
    звуком сопровождающим ее можно рассчитать расстояние.
    Допустим интервал 7,2 секунды.
     */
        System.out.println("այս ծրագիրը կօգնի հաշվել " +
                "կայծակի ու գետնի միջև ընկած հեռավորությունը");
        Scanner key=new Scanner(System.in);
        System.out.println("Մուտքագրեք ժամանակահատվածը");
        double timeForMolniya=key.nextDouble();

        int speed = 1100;
        double way=speed*timeForMolniya;
        System.out.println(" ");
        System.out.println("կայծակի և գետնի միջև ընկած " +
                "տարածությունը հավասար է "+way+"կիլոմետր");



    }
}
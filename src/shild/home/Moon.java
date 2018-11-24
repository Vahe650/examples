package shild.home;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        System.out.println("Այս ծրագիրը կոգնի ձեզ իմանալ ձեր քաշը" +
                "Լուսնի վրա ։-) ");
        System.out.println("և այսպես");
        //Scanner-ը Ընդունում է օգտվողի ներմուծած տվյալները
        Scanner keyboard=new Scanner(System.in);
        System.out.println("ինչքա՞ն է ձեր քաշը Երկեի վրա։Կգ։ ");
        System.out.println("Մուտքագրեք Թիվը");
        double weightPeopleEarth=keyboard.nextInt();
        //Հաշվում ենք օգտվողի քաշը Լուսնի վրա
        double weightPeopleMoon=weightPeopleEarth*0.17;
        //կոնսոլի վրա տպում ենք պատասխանը
        System.out.println(" ");
        System.out.println(" Ձեր քաշը լուսնի " +
                "վրա հավասար է "+weightPeopleMoon+"Կգ");
    }
}

package chapter9.adveture;

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharachter x) {
        x.fight();
    }

    public static void y(CanClimb x){
        x.climb();
    }

    public static void main(String[] args) {
        ClassHero hero = new ClassHero();
        t(hero);
        u(hero);
        v(hero);
        y(hero);
        w(hero);

    }

}

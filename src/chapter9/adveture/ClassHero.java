package chapter9.adveture;

public class ClassHero extends ActionCharachter implements CanFight,CanFly,CanSwim,CanClimb {
    @Override
    public void fly() {
        System.out.println("fly");

    }

    @Override
    public void swim() {
        System.out.println("swim");

    }


    @Override
    public void climb() {
        System.out.println("climb");

    }
}

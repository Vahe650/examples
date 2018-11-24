package chapter8.Sandwich;

interface Meal {
     void meal();
}

class Lunch implements Meal {
    public Lunch() {
        System.out.println("Lunch");
        meal();

    }
    @Override
    public  void meal() {
        System.out.println("meal");

    }
}

class PortableLounch extends Lunch {
    public PortableLounch() {
        System.out.println("PortableLounch");
    }
}

public class Sandwich extends PortableLounch implements FastFood {
    public Sandwich() {
        System.out.println("Sandwich");
    }
    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        System.out.println("===========");
        sandwich.makeSandwich(sandwich);

    }
    @Override
    public void bread() {
        System.out.println("bread");
    }

    @Override
    public void cheese() {
        System.out.println("cheese");

    }

    @Override
    public void lettuce() {
        System.out.println("lettuce");

    }

    @Override
    public void tomato() {
        System.out.println("tomato");
    }

    @Override
    public void ketchup() {
        System.out.println("ketchup");

    }

    @Override
    public void mayonez() {
        System.out.println("mayonez");

    }

    @Override
    public void price(int value) {
        value=500;
        System.out.println(value);

    }


}

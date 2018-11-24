package chapter8.animal;

class Charachteristic {
    private static String str="eto sushestvo - ";
    public static Charachteristic ourInstance=new Charachteristic(str);
    private String string;
    private static int i = 0;

    private Charachteristic(String string) {
        this.string = string;

    }
    public static Charachteristic getOurInstance(String s){
        System.out.println(str+s);
        return ourInstance;
    }


    protected static void dispose(String string) {
        System.out.println(++i + ": zavershayem Charachteristic ");
        System.out.println( string);
    }
}


class Description {
    private String string;
    private static int i;
    private static int anInt;

    public Description(String string) {
        this.string = string;
        System.out.println(++i + ": sozdayom Description " );
        System.out.println(string);
    }

    protected void dispose() {
        System.out.println(++anInt + ": zavershayem Description ");
        System.out.println(string);
    }
}


class LivingCreature {
    private   String string="jivoe sushestvo";
    public LivingCreature() {
        Charachteristic.getOurInstance(string);
        System.out.println("LivingCreature");
    }

    private Description description =
            new Description("obichnoe jivoe sushestvo");


    protected void dispose() {
        System.out.println("dispose() v LivingCreature");
        Charachteristic.dispose(string);
        description.dispose();
    }
}

class Animal extends LivingCreature {
    private String string="imeet serdce";
    private Description description =
            new Description("jivotnoe ,,ne rastenie");

    public Animal() {
        Charachteristic.getOurInstance(string);
        System.out.println("Animal()");
    }

    protected void dispose() {
        System.out.println("dispose() v Animal");
        Charachteristic.dispose(string);
        description.dispose();
        super.dispose();
    }
}


class Amphibian extends Animal {
    private String string="mojet jit v vode";
    private Description description =
            new Description("i v vode i na zemle");

    public Amphibian() {
        Charachteristic.getOurInstance(string);
        System.out.println("Amphibian");
    }

    protected void dispose() {
        System.out.println("dispose() v Amphibian");
        Charachteristic.dispose(string);
        description.dispose();
        super.dispose();
    }
}


public class Frog extends Amphibian {
    private String string="kvakaet";
    private Description description =
            new Description("est jukov");

    public Frog() {
        Charachteristic.getOurInstance(string);

        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("zavershenie Frog");
        Charachteristic.dispose(string);
        description.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("poka");
        frog.dispose();
    }
}

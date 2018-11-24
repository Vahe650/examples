package classConstructor.cicle;

public class Cicle {
    Cicle balance(Cicle cicle){
        System.out.println("Cicle balance");
        return cicle;
    }

    public static void main(String[] args) {
        UNiCicle uNiCicle=new UNiCicle();
        BiCicle biCicle=new BiCicle();
        TriCicle triCicle=new TriCicle();
        Cicle[] cicles={uNiCicle,biCicle,triCicle};
        for (Cicle cicle : cicles) {
            cicle.balance(cicle);
            cicles[0].balance(biCicle);

        }
        try {
            ((TriCicle) cicles[2]).unBalance();
            ((TriCicle) cicles[0]).unBalance();
            ((TriCicle) cicles[1]).unBalance();

        }catch (ClassCastException e){
            System.out.println("chi krna exni");
        }


    }
}

package classConstructor.cicle;

public class UNiCicle extends Cicle {


    @Override
    Cicle balance( Cicle cicle) {
        System.out.println("UNiCicle balance");
        return cicle;
    }
}

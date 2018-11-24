package classConstructor.cicle;

public  class BiCicle extends Cicle {
    @Override
    Cicle balance( Cicle cicle) {
        System.out.println("BiCicle balance");
        return cicle;
    }

}

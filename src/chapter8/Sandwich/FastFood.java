package chapter8.Sandwich;

public interface FastFood {
    void bread();
    void cheese();
    void lettuce();
    void tomato();
    void ketchup();
    void mayonez();
    void price(int i);
    default Sandwich makeSandwich(Sandwich sandwich){
        bread();
        cheese();
        lettuce();
        tomato();
        ketchup();
        mayonez();
        price(100);
        return sandwich;
    }

}

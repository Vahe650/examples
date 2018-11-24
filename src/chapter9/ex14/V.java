package chapter9.ex14;

public class V extends X implements A {
    @Override
    public void dzayguk() {

    }

    @Override
    public void tanj() {

    }

    @Override
    public void veish() {

    }

    @Override
    public void chuyl() {

    }

    @Override
    public void shayr() {

    }

    @Override
    public void dinj() {

    }

    @Override
    public void chmuyt() {

    }

    static void em(E e) {
        e.tanj();
        e.veish();
    }

    static void ra(R r) {
        r.chmuyt();
        r.dinj();
    }

    static void no(N n) {
        n.chuyl();
        n.shayr();
    }

    static void as(A a) {
        a.dzayguk();
    }

    public static void main(String[] args) {
        V v = new V();
        em(v);
        ra(v);
        no(v);
        as(v);

    }

    @Override
    void bor() {

    }
}

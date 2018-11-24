package chapter9.subBase;

public class Sub extends Base {
    int anInt=0;

    @Override
    void print(int i) {
       i=anInt;
        System.out.println(i);
    }
}

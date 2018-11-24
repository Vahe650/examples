package chapter9.randVals;

import java.util.Random;

public interface RandVals {
    Random RANDOM=new Random(47);
    int RANDOM_INT=RANDOM.nextInt(10);
    long RANDOM_LONG=RANDOM.nextLong()*10;
    float RANDOM_FLOAT=RANDOM.nextFloat()*10;
    double RANDOM_DOUBLE=RANDOM.nextDouble()*10;
}
class TestRandVals{
    public static void main(String[] args) {
        System.out.println(RandVals.RANDOM_INT);
        System.out.println(RandVals.RANDOM_LONG);
        System.out.println(RandVals.RANDOM_FLOAT);
        System.out.println(RandVals.RANDOM_DOUBLE);

    }
}

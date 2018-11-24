package chapter8.music;


import java.util.Random;

public class RandomINstrumentGEnerator {
    private Random random = new Random(47);

    public Instrument next() {
        switch (random.nextInt(6)) {

            case 0:
                return new Wind();
            case 1:
                return new Percusiion();
            case 2:
                return new Stringed();
            case 3:
                return new Brass();
            case 4:
                return new Woodwind();
            default:
                return new Instrument();
        }
    }
}

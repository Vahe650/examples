package chapter8.music;

public class Music3 {
   private static RandomINstrumentGEnerator randomINstrumentGEnerator=new RandomINstrumentGEnerator();
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE);
        instrument.adjust();
        instrument.what();
    }
    public static void tuneAll(Instrument[] args) {
        for (Instrument instrument :args) {
            tune(instrument);
        }




    }
    public static void main(String[] args) {
        Instrument[] orchestra = {new Wind(), new Percusiion(), new Stringed(), new Brass(), new Woodwind()};
        tuneAll(orchestra);
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = randomINstrumentGEnerator.next();
        }
    }

}

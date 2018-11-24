package chapter9.music;

public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE);
    }
    static void tuneAll(Instrument[] instruments){
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra={
                new Wind(),
                new Percusiion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}

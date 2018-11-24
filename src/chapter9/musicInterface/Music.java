package chapter9.musicInterface;

public class Music {
    static void tune(Playable instrument){
        instrument.play(Note.SHARP);
    }
    static void tuneAll(Playable[] instruments){
        for (Playable instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Playable[] orchestra={
                new Wind(),
                new Percusiion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);

    }
}

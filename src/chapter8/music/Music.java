package chapter8.music;

public class Music {
    public static  void tune(Instrument i) {
        i.play(Note.MIDDLE);
    }

    public static void main(String[] args) {
        Wind wind=new Wind();
        Instrument i=new Instrument();
        tune(i );
        tune(wind);
    }
}

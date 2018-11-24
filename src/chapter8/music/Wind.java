package chapter8.music;

public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play()"+note);
    }

    @Override
    public String what() {
        System.out.println("Wind");
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("adjusting Wind");
    }
}

package chapter8.music;

public class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play()"+note);
    }

    @Override
    public String what() {
        System.out.println("Stringed");
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

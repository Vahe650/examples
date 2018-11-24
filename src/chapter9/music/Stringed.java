package chapter9.music;

public class Stringed extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Stringed.play()" + note);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {
    }
}

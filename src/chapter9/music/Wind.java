package chapter9.music;

public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind.play()" + note);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
    }
}

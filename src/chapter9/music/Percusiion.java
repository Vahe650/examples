package chapter9.music;

public class Percusiion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("percussion.play()"+note);
    }

    @Override
    public String what() {
        return "Percusiion";
    }

    @Override
    public void adjust() {
    }
}

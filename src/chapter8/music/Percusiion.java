package chapter8.music;

public class Percusiion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("percussion.play()"+note);
    }

    @Override
    public String what() {
        System.out.println("Percusiion");
        return "Percusiion";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

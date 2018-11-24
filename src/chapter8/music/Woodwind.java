package chapter8.music;

public class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play()"+note);
    }


    @Override
    public void adjust() {
        System.out.println("adjusting Woodwind");
    }
}

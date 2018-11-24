package chapter9.musicInterface;

public class Stringed extends AddAbstractClass implements Instrument,Playable {
    @Override
    public void play(Note note) {
        System.out.println(this+".play()" + note);
    }

    @Override
    public String toString() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println(this+". adjust()");
    }
}

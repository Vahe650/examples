package chapter9.musicInterface;

public class Percusiion extends AddAbstractClass implements Instrument,Playable {
    @Override
    public void play(Note note) {
        System.out.println(this+".play()"+note);
    }

    @Override
    public void adjust() {
        System.out.println(this+". adjust()");
    }

    @Override
    public String toString() {
        return "Percusiion";
    }
}

package chapter9.music;

public abstract class Instrument {
    private int i;

    public abstract void play(Note note);
    public String what(){
        return "Instrument";
    }
    public abstract void adjust();
}

package chapter8.music;

public class Instrument {

    public  void play(Note note){
        System.out.println("Instrument.play()");
    }
    public String what(){
        System.out.println("Instrument");
        return "Instrument";
    }
    public void adjust(){
        System.out.println("Adjusting Instrument");
    }
}

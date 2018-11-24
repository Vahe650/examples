package classConstructor.millain;

public class Villain {
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    public Villain(String name){
        this.name=name;
    }
    public String toString() {
            return "yes Villainn em,anuns el" + name;
        }
    }




package classConstructor.millain;

public class Orc extends Villain {
    private int orcNumber;
    public Orc(String name,int orcNumber){
        super(name);
        this.orcNumber=orcNumber;
    }
    public void change(String name,int orcNumber){
        set(name);
        this.orcNumber=orcNumber;
    }
    public String toString(){
        return "Orc"+orcNumber+":"+super.toString();
    }
    public static void main(String[] args){
        Orc orc=new Orc("limburger",12);
        System.out.println(orc);
        orc.change("bob",19);
        System.out.println(orc);

    }
}

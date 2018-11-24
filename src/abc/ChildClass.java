package abc;

public class ChildClass extends  BaseClass{
    String sis;
    int vis;
    public ChildClass() {
        super();
    }

    public ChildClass(String sis, int vis) {
        super();
        this.sis = sis;
        this.vis = vis;
    }
    void first(boolean b){
        System.out.println("boolean");
    }

    public static void main(String[] args) {

        ChildClass childClass=new ChildClass();
        childClass.first(true);
        childClass.first(1);
        childClass.first('c');
        childClass.first("name");

    }



}

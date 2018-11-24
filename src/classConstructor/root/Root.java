package classConstructor.root;

public class Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();
    ;

    public Root() {

        System.out.println("root");
    }

    void dispose() {
        component1.dispose();
        component2.dispose();
        component3.dispose();
        System.out.println("root dispose");
    }
}

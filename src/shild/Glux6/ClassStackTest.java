package shild.Glux6;

public class ClassStackTest {
    public static void main(String[] args) {
        ClassStack mystack1=new ClassStack();
        ClassStack mystack2=new ClassStack();
        //texadrel stackum tiv
        for (int i = 0; i <10 ; i++) mystack1.push(i);
        for (int i = 10; i <20 ; i++) mystack2.push(i);

        //hanel tver@ stackic
        System.out.print("Mystack1-i parunakutyun@: ");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack1.pop());
        System.out.println();
        System.out.print("Mystack2-i parunakutyun@: ");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack2.pop());





    }
}

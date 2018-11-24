package shild.DynamicArrayMethod;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dynamic=new DynamicArray();

        dynamic.add(92);
        dynamic.add(65);
        dynamic.add(33);
        dynamic.add(71);
        dynamic.add(74);
        dynamic.add(75);
        dynamic.add(78);
        dynamic.add(45);
        dynamic.add(98);
        dynamic.add(15);
        dynamic.add(10);
        dynamic.add(90);
        dynamic.add(80);
        dynamic.add(40);
        dynamic.add(30);
        dynamic.add(29);
        dynamic.add(23);
        dynamic.add(24);
        dynamic.add(25);
        dynamic.add(26);
        dynamic.add(21);
        dynamic.add(28);
        dynamic.print();
        int getindex=dynamic.getByIndex(19);
        System.out.println(getindex);
        dynamic.deleteByIndex(8);
        dynamic.print();



    }
}

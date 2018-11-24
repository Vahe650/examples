package shild.collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //sarqel kapvac cank
        LinkedList<String> linkedList=new LinkedList<String>();
        //avelacnel elementner
        linkedList.add("f");
        linkedList.add("b");
        linkedList.add("d");
        linkedList.add("e");
        linkedList.add("c");
        linkedList.addLast("z");
        linkedList.addFirst("a");
        linkedList.add(1,"a2");
        System.out.println("skzbnakan parunakutyun@ "+linkedList);
        //jnjel elementner
        linkedList.remove("f");
        linkedList.remove(2);
        System.out.println("parunakutyun@ jnjeluc heto "+ linkedList);
        //jnjel araji u verji elementner@
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("parunakutyun@ araji u verji " +
                "element@ jnjeluc heto "+linkedList);
        //stanal ev veragrel arjeq
        String val=linkedList.get(2);
        linkedList.set(2,val+": poxvav");
        System.out.println("parunakutyun@ popoxutyunic heto "+ linkedList);

    }
}

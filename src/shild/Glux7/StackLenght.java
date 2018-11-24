package shild.Glux7;
//Усовершенствованный класс Stack,в котором
// использован член длины массива

public class StackLenght {
    private int stack[];
    private int tos;

    //выделить память под стек и инициализировать его
    StackLenght(int size) {
        stack = new int[size];
        tos = -1;
    }

    //размеcтить элемент в стеке
    void push(int item) {
        if (tos == stack.length - 1)//использовать член длины массива
            System.out.println("Cтeк заполнен .");
        else
            stack[++tos] = item;
    }

    //извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен .");
            return 0;
        } else
            return stack[tos--];
    }
}

class TestStackLength {
    public static void main(String[] args) {
        StackLenght mystack1 = new StackLenght(5);
        StackLenght mystack2 = new StackLenght(8);
        //разместить числа в стеке
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);
        // извлечь эти числа из стека
        System.out.println("Cтeк в mystackl :");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Cтeк в mystack2 :");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());

    }

}

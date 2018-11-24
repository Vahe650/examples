package shild.Glux7;

//В этом классе определяется целочисленный стек,который
// содержать 10 значений может
public class StackPrivate {
    //Теперь переменные stck и tos являются закрытыми .
//Это означает,что они не могут быть случайно или
//намеренно изменены таким образом, чтобы нарушить стек
    private int stack[] = new int[10];
    private int tos;

    //инициализировать вершину стека
    StackPrivate() {
        tos = -1;
    }

    //разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Cтeк заполнен");
        else
            stack[++tos] = item;

    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен");
            return 0;
        } else return stack[tos--];
    }
}
class TestStackPrivate{
    public static void main(String[] args) {
        StackPrivate mystack1=new StackPrivate();
        StackPrivate mystack2=new StackPrivate();
        //разместить числа в стеке
        for (int i = 0; i <10 ; i++) mystack1.push(i);
            for (int i = 0; i <20 ; i++)mystack2.push(i);
            //извлечь эти числа из стека
        System.out.println("Cтeк в mystackl:");
        for (int i = 0; i <10 ; i++)
            System.out.println(mystack1.pop());

        System.out.println("Cтeк в mystack2:");
        for (int i = 0; i <10 ; i++)
            System.out.println(mystack2.pop());
        // эти операторы недопустимы
       // mystack1.tos=-2;
       // mystack2.stack[3]=100;










    }
}





package shild.Glux7;

//В э той программе демонстрируется отличие
//модификаторов public и private .
public class MyMethod {
    int a; //доступ,определяемый по умолчанию
    public int b;//доступ,определяемый по умолчанию
    private int c;//з а крытый дос туп

    //методы доступа к члену с данного класса
    void setC(int i) {//установить значение члена с данного класса
        c = i;
    }

    int getC() {
        return c;//получить значение члена с данного класса
    }
}

class AccessMethod {
    public static void main(String[] args) {
        MyMethod object = new MyMethod();
        //Эти операторы правильны,поэтому члены a N b
        // данного класса доступны непосредственно
        object.a = 10;
        object.b = 20;
        //Этот оператор не верен и может вызвать ошибку
        //ob.c=100  //OWNBKA!!!
        // Доступ к члену с данного класса должен осуществляться
        // с помощью методов ее класса
        object.setC(100);//BERHO
        System.out.println("a,b & c: " + object.a + " " + object.b + " " + object.getC());


    }
}




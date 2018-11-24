package shild.Glux7;

public class OverloadDemo1 {
    void test(){
        System.out.println("Пapaмeтpы отсутствуют");
    }
    //Перегружаемый метод , проверяющий наличие
    // двух целочисленных параметров
    void test(int a ,int b){
        System.out.println("a & b: "+a+""+b);
    }
    //Перегружаемый метод,проверяющий наличие
    // параметра типа douЬle
    void test(double a){
        System.out.println("Внутреннее преобразование при " +
                "вызове test(douЬle) а:" + a);
    }
    static class OverloadDemo{
        public static void main(String[] args) {
            OverloadDemo1 object=new OverloadDemo1();
            int i=88;
            object.test();
            object.test(10,20);
            object.test(i);//здесь вызывается вариант метода test(douЬle)
            object.test(123.2);//здесь вызывается вариант метода test(douЬle)
        }
    }
}

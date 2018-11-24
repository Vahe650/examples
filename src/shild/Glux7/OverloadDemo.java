package shild.Glux7;

public class OverloadDemo {
    void test(){
        System.out.println("Пapaмeтpы отсутствуют");
    }
    //Перегружаемый метод , проверяющий наличие
    // одного целочисленного параметра
    void test(int a){
        System.out.println("a: "+a);
    }
    //Перегружаемый метод, проверяющий наличие
    //двух целочисленных параметров
    void test(int a,int b){
        System.out.println("a & b ="+a+" "+b);
    }
    //Перегружаемый метод , проверяющий наличие
    //параме тра типа douЬle
    double test(double a){
        System.out.println("double a: "+a);
        return a*a;

    }
}
class Overload{
    public static void main(String[] args) {
        OverloadDemo object= new OverloadDemo();
        double result;
        //вызвать все варианты метода teвt ( )
        object.test();
        object.test(10);
        object.test(10,20);
        result=object.test(123.25);
        System.out.println("Peзyльтaт вызова object.test(123.25): "+result);
    }

}
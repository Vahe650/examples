package shild.Glux7;

//Объекты допускается передавать методам в качестве параметров
public class Test {
    int a, b;

    public Test(int i, int j) {
        a = i;
        b = j;
    }
    //возвратить логическое значение true, если в качестве
    // параметра о указан вызывающий объект
    boolean equals(Test o){
        if (o.a==a&&o.b==b) return true;
        else return  false;
    }
}
class PassObject{
    public static void main(String[] args) {
        Test object1=new Test(100,22);
        Test object2=new Test(100,22);
        Test object3=new Test(-1,-1);
        System.out.println("object1==object2:"+ object1.equals(object2));
        System.out.println("object1==object3:"+ object1.equals(object3));
    }
}

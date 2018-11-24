package shild.Glux7;
//Аргументы примитивных типов передаются по значению
public class TestMeth {
    void meth(int i,int j){
        i*=2;
        j/=2;
    }
}
class CallByValue{
    public static void main(String[] args) {
        TestMeth ob=new TestMeth();
        int a=15,b=20;
        System.out.println("a и Ь до вызова : "+a+" "+b);
        ob.meth(a,b);
        System.out.println("a и Ь после вызова : "+a+" "+b);
    }
}

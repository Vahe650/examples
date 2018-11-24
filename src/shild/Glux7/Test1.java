package shild.Glux7;
// Объекты передаются по ссылке на них
public class Test1 {
    int a,b;
    Test1(int i,int j ){
        a=i;
        b=j;
    }
    // передать объект
    void meth(Test1 o){
        o.a*=2;
        o.b/=2;
    }
}
class  PassObjRe{
    public static void main(String[] args) {
        Test1 ob=new Test1(15,20);
        System.out.println("ob.a и оb.b до вызова :"+ob.a+ " "+ob.b);
        ob.meth(ob);
        System.out.println("ob.a и оb.b после вызова :"+ob.a+ " "+ob.b);
    }
}

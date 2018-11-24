package shild.Glux2;

public class If {
    public static void main(String[] args) {
       int x,y;
        x=10;
        y=20;
        if(x<y) System.out.println("x < y "+(x<y));
        x=x*2;
        if(x==y) System.out.println("x= y "+(x==y));
        x=y*2;
        if(x>y) System.out.println("y > x  "+(y>x));
       int a, b;
        a = 15;
        b = 10;
        if (a < b) a = 0; //ete paymany chisht e uremn a=0 ete voch uremn b=0
        else b=0;
        System.out.println(b);
  /* int a,b,c,d,i,j,k;
    if(i==10){
        if (j<20) a=b; //ays if-@ kapvac e
        if (k<100) c=d;// ays elsei het
        else a=c;
    }
    else a=d; //isk ays else-@ kapvac e if(i=10)i het*/


    }
}

package shild.Glux3;
//В следующем примере программы демонстрируется продвижение типа одного
//из операндов для соответствия типу второго операнда в каждом операторе с двумя
//операндами:
public class ClassOperand {
    public static void main(String[] args) {
        byte b=42;
        char c='a';
        short s =1024;
        int i =50000;
        float f=5.67f;
        double d=.1234;
        double result= (f*b)+(i/c)-(d*s);
        System.out.println((f*b)+"+"+(i/c)+"-"+(d*s));
        System.out.println("result= "+result);

        }
    }


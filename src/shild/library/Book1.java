package shild.library;

public class Book1 {
    String title;
    int count;
    double price;
    Autor1 autor1;

     Book1(String title, int count, double price
            , Autor1 autor1){
        this.title=title;
        this.count=count;
        this.price=price;
        this.autor1 = autor1;


    }

    @Override
    public String toString() {
        return "Book1{"+"title="+title+'/'+",count="+'/'
                +",price="+price+'/'+",author="+ autor1 +"autor1"+'}';
    }
}

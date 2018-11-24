package shild.Glux7;

import javax.sound.midi.Soundbank;

//В этой версии класса Вох один объект допускается
// инициализировать другим объектом
public class Boxo {
    double width;
    double height;
    double depth;
    //Обратите внимание на этот конструктор
    // В качестве параметра в нем используется объект типа Вох
    Boxo(Boxo ob){//передать объект конструктору
       width=ob.width;
       height=ob.height;
       depth=ob.depth;
    }
    //конструктор ,используемый при указании всех размеров
    Boxo(double w,double h,double d){
        width =w;
        height=h;
        depth=d;
    }
    //конструктор,используемый, если ни один из размеров не указан
    Boxo(){
        width=-1;//использовать значени е-1 для обозначения
        height=-1;//неинициализированного
        depth=-1;//параллелепипеда
    }
    //конструктор,используемый при создании куба
    Boxo(double len){
        width=height=depth=len;
    }
    //рассчитать и возвратить объем
    double volume(){
        return width*depth*height;
    }

}
class OverloadCons2{
    public static void main(String[] args) {
        //создать параллелепипеды,используя
        //разные конструкторы
        Boxo mybox1=new Boxo(10,20,15);
        Boxo mybox2=new Boxo();
        Boxo mycube=new Boxo(7);
        Boxo myclone=new Boxo(mybox1);
        //создать копию объекта mybox1
        double vol;
        //получить объем первого параллелепипеда
        vol=mybox1.volume();
        System.out.println("Oбъeм myboxl равен "+vol);
        //получить объем второго параллелепипеда
        vol=mybox2.volume();
        System.out.println("Oбъeм mybox2 равен "+vol);
        //получить объем куба
        vol=mycube.volume();
        System.out.println("Oбъeм куба равен "+vol);
        //получить объем клона
        vol=myclone.volume();
        System.out.println("Oбъeм клона равен "+vol);

    }
}



















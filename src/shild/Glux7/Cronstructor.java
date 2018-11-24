package shild.Glux7;

class Cronstructor {
    double widht;
    double height;
    double depth;
//Это конструктор класса Constructor
    public Cronstructor(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }
    //рассчитать и возвратить объем
    double volume(){
        return widht*height*depth;
    }
}
class Box {
    //В данном примере конструкторы определяются в классе Вох для
    // инициализации размеров параллелепипеда тремя разными способами
    double widht;
    double height;
    double depth;

    //конструктор,используемый при указании всех размеров
    public Box(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }
    //конструктор используемый, когда ни один из размеров не указан
    Box(){
        widht=-1;//использовать значение -1 для обозначения
        height=-1;//не инициализированного
        depth=-1;//параллелепипеда
    }
//конструктор,используемый при создании куба
    Box(double len){
        widht=height=depth=len;
    }
    //рассчитать и возвратить объем
    double volume(){
        return widht*height*depth;
    }
}
class OverloadCons{
    public static void main(String[] args) {
        //создать параллелепипеды,используя разные конструкторы
        Box mybox1=new Box(10,20,15);
        Box mybox2=new Box();
        Box mycube=new Box(7);
        double vol;
        //получить объем первого параллелепипеда
        vol=mybox1.volume();
        System.out.println("Oбъeм myboxl равен "+vol);
        // получить объем второго параллелепипеда
        vol=mybox2.volume();
        System.out.println("Oбъeм mybox2 равен "+vol);
        //получить объем куба
        vol=mycube.volume();
        System.out.println("Oбъeм mycube равен "+vol);

    }
}
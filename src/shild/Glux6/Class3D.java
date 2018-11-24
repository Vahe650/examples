package shild.Glux6;

class Class3D {
    double width;
    double heigth;
    double depth;

    // sa Class3d-i kanstruktorn e Demo 7
    Class3D(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    //sa klassi konstruktorn e Demo6
    Class3D() {
        System.out.println("Koнcтpyиpoв aниe объекта Вох");
        width = 10;
        heigth = 10;
        depth = 10;
    }

    //hashvel u veradarznel caval@
    double volume() {
        return width * heigth * depth;
    }


    //texadrel xoranaradi chapser@ Demo5
    void setDim(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Class3D mybox1 = new Class3D();
        Class3D mybox2 = new Class3D();
        double vol;
        //inicializacnel 3D klassi yuraqanchyur exemplyarш
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        //stanal araji xoranardi caval@
        vol = mybox1.volume();
        System.out.println("caval@ havasar e " + vol);
        //stanal erkrord xoranardi caval@
        System.out.println("caval@ havasar e " + mybox2.volume());
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        //haytararel,arandznacnel ev inicializacnel Box tipi obektner@
        Class3D mybox1 = new Class3D();
        Class3D mybox2 = new Class3D();

        //stanal arajini caval@
        System.out.println("caval@ havasar e " + mybox1.volume());
        //stanal erkrordin@
        System.out.println("caval@ havasar e " + mybox2.volume());
    }
}
class BoxDemo7 {
    public static void main(String[] args) {
        //haytararel u arandznacel hishoxutyun ev incializacnel Box tipi obektner@
        Class3D mybox1=new Class3D(10,20,15);
        Class3D mybox2=new Class3D(3,6,9);
        //stanal arajini caval@
        System.out.println("caval@ havasar e "+mybox1.volume());
        //stanal erkrordi caval@
        System.out.println("caval@ havasar e "+mybox2.volume());

    }
}


/*11 Избыточное приме н ение ключевого слова this
Box ( double w, double h, doublee d) {
this.width = w;
this.height = h;
this.depth = d;*/

















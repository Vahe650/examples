package shild.Glux6;

import javax.swing.*;

class Box {
    double widht;
    double height;
    double depth;

    // hashvel ev veradarcnel caval@
    double volum() {
        return widht * height * depth;
    }

    //artaberel xoraardi caval@
    void volume() {
        System.out.println("caval@ havasar e  " + widht * depth * height);
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();//Box klassum stexcel mybox object
        double vol;
        mybox.widht = 10;
        mybox.height = 20;//mybox exemplyari popoxakannerin
        mybox.depth = 15;// veragrel arjeq
        //hashvel xoranardi caval@
        vol = mybox.depth * mybox.height * mybox.widht;
        System.out.println("caval@ havasar e " + vol);

    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        //mybox1-i popoxakannerin tal arjeq
        mybox1.widht = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        //mybox2-i popoxakannerin tal arjeq
        mybox2.widht = 3;
        mybox2.depth = 5;
        mybox2.height = 9;

        //hashvel mybox1-i caval@
        vol = mybox1.depth * mybox1.height * mybox1.widht;
        System.out.println("mybox1-i caval@= " + vol);
        //hashvel mybox2-i caval@
        vol = mybox2.widht * mybox2.height * mybox2.depth;
        System.out.println("mybox2-i caval@=  " + vol);
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        //veragrel arjeq mybox1-i popoxakannerin
        mybox1.widht = 10;
        mybox1.height = 20;
        mybox1.depth = 15;
        //veragrel urish arjeq mybox2i popoxakannerin
        mybox2.widht = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // tpel mybox1.volume-i caval@
        mybox1.volume();
        //tpel mybox2.volume-i caval@
        mybox2.volume();
    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        //veragrel arjeq mybox1-i popoxakannerin
        mybox1.widht=11;
        mybox1.height=12;
        mybox1.depth=13;
        //veragrel ardeq mybox2i popoxakannerin
        mybox2.depth=2;
        mybox2.widht=3;
        mybox2.height=4;
        //stanal araji xoranardi arjeq@
        vol=mybox1.volum();
        System.out.println("caval@ havasar e "+vol);//System.out.println
        //stanal erkrord xoranardi arjeq@
        vol=mybox2.volum();
        System.out.println("caval@ havasar e  "+vol);//(caval@ havasar e+mybox1.volum())
    }
}








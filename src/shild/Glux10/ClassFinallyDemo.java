package Glux10;

public class ClassFinallyDemo {
    static void processA(){
        try {
            System.out.println("processA metodi marnum");
            throw new RuntimeException("demo");

        }finally {
            System.out.println("finally operatori blokavorum " +
                    "processA() metodi mej");
        }
    }
    //veradardznel karavrum@ try operatori blokic
    static void processB(){
        try {
            System.out.println("processB() metodi marnum");
            return;
        }finally {
            System.out.println("finally operatori blokavorum "+
                    "processB() metodi mej");
        }
    }
    //try bloki katarum
    static void processC(){
        try {
            System.out.println("processC() metodi marnim mej");
        }finally {
            System.out.println("finally operatori blokavorum "+
                    "processC() metodi mej");
        }
    }

    public static void main(String[] args) {
        try{
            processA();
        }catch (Exception e){
            System.out.println("bacarutyun@ brnvac e"+e);
        }
        processB();
        processC();
    }
}

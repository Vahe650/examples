package shild.Glux10;

public class OwnExcDemo {
    static void demoProcess(){
        //patrastel bacarutyun
        NullPointerException e=new NullPointerException("verevi makardak");
        //avelacnel bacarutyan patchar
        e.initCause(new ArithmeticException("patchar"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProcess();
        }catch (NullPointerException e){
            //durs berel verevi makardaki bacarutyun@
            System.out.println("bacarutyun@ brnel em: "+e);
            //durs berel bacarutyun@ vor@
            //patchar e handisacel verevi bacarutyan hamar
            System.out.println("arajnayin patchar "+e.getCause());
        }
    }
}

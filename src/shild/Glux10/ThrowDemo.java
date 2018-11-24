package shild.Glux10;

public class ThrowDemo {
    static void demoproc(){
        try {
            throw new NullPointerException("demo");
        }catch (NullPointerException e){
            System.out.println("bacarutyun@ brnvac e demoproc()" +
                    "metodi marmni mej");
            throw e;//krknaki gorcarkel bacarutyun@
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println("krknaki brnvacQ :D "+ e);
        }
    }
}

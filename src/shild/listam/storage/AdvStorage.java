package shild.listam.storage;


import shild.listam.model.Advertisment;
import shild.listam.model.User;

public class AdvStorage {
    private Advertisment[] advers=new Advertisment[16];
    int size=0;
    public void addAdver(Advertisment adver){
        if (advers.length==size){
            extand();
        }
        size++;
    }
    public void extand(){
        Advertisment[] temp=new Advertisment[advers.length+10];
        System.arraycopy(advers,0,temp,0,advers.length);
        temp=advers;

    }
    public void printAllAdvers(){
        for (int i = 0; i <size ; i++) {
            System.out.println(advers[i]);


        }
    }

    public void printAdversByUser(User user){
        for (int i = 0; i <size ; i++) {
            if (advers[i].equals(user.getUsername())){
                System.out.println(advers[i]);
            }

        }
    }
    public void prindAdverByType(String type){
        for (int i = 0; i <size ; i++) {
            if (advers[i].equals(type)){
                System.out.println(advers[i]);
            }

        }
    }

}

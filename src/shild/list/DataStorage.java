package shild.list;

public class DataStorage {
    User base[] = new User[10];// [[usernam,name,......],[user2,kakakakkamakal], [user3]]
    int size = 0;               //       0                        1                 3

    public void add(User singleData) {
        if (size == base.length) {
            extend();
        }
        base[size] = singleData;
        size++;
    }

    public void extend() {
        User[] temp = new User[base.length + 10];
        for (int i = 0; i < base.length; i++) {
            temp[i] = base[i];
        }
        temp = base;
    }

    public void registration(String name, String surname, String username, String password) {
        User nor = new User(name, surname, username, password);
        add(nor);
        System.out.println("Thank you for join us");
    }

    // username = Vahe9
    // base = [b1][b2]............[bn]
    // b5 = [ Vahe,Sim. vahe9. 456]
    // b-Ն գետով.յուզեռնեյմով B5-ի ՅՈՒզեռնեյմը
    // bn = [username,name,surname,password]
    // username- սա, ես քեզի կուդամ էն b-ն որը որ ունի յուզեռնեյմին
    public User getUserByLogIn(String logIn) {
        for (int i = 0; i < size; i++) {
            if (base[i].getUsername().equals(logIn)) {
                return base[i];

            }
        }
        return null;
    }
    public String getPassByLogIn(String username) {
        for (int i = 0; i < size; i++) {
            if (base[i].getUsername().equals(username)) {
                return base[i].getPassword();

            }
        }
        return null;
    }
    public  String getNameByUserNames(String username){
        for (int i = 0; i <size ; i++) {
            if (base[i].getUsername().equals(username)){
                return base[i].getName();
            }

        }
        return null;
    }
    public void deleteUserbyLogIn(String logIn){
        int jnjvoxiTex = 0;
        for(int i = 0; i<size;i++){
            if(base[i].getUsername().equals(logIn)){
                jnjvoxiTex = i;
            }
        }
        for (int j = jnjvoxiTex; j <size; j++) {
            base[j] = base[j+1];
        }
        size--;
        for(int i = 0; i<size;i++){
            System.out.println(base[i]);
        }
    }
    public void changePassByUsername(User newPassword){
        for (int i = 0; i <size ; i++) {
            if (!base[i].getPassword().equals(newPassword)){
                newPassword=base[i];
            }

        }
    }
}




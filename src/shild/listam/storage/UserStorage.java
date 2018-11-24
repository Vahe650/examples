package shild.listam.storage;

import shild.listam.exception.MyEx;
import shild.listam.model.User;

public class UserStorage {
    private User[] users = new User[16];
    int size = 0;

    public void add(User user) {
        if (users.length == size) {
            extand();
        }
        users[size++] = user;
    }

    public void extand() {
        User[] temp = new User[users.length + 10];
        System.arraycopy(users, 0, temp, 0, users.length);
    }

    public User getUserByUsernameAndPassword(String username, String password){
        for (int i = 0; i < size; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) ;
            return users[i];
        }
        return null;
    }

    public boolean dupUsername(String logIn) {
        for (int i = 0; i < size; i++) {
            if (users[i].getUsername().equals(logIn)) {
                return true;


            }

        }
        return false;
    }
    public void searchUserByUsername(String name) throws MyEx {
        for (int i = 0; i <size ; i++) {
            if (!users[i].getUsername().equals(name))
                throw new MyEx(name);
            else {
                System.out.println("User is Valid");
            }
        }
    }


}

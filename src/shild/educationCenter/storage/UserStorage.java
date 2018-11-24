package shild.educationCenter.storage;

import shild.educationCenter.model.User;

public class UserStorage {
    private User[] users = new User[16];
    private int size = 0;

    public void add(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }

    public User getUserByUsernameAndPassword(String username, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }

    public User changePassword(String old, String nor, String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getUsername().equalsIgnoreCase(email) && users[i].getPassword().equalsIgnoreCase(old)) {
                users[i].setPassword(nor);

            }

        }return null;

    }
    public User getUserByUsername(String username){
        for (int i = 0; i < size; i++) {
            if (users[i].getUsername().equalsIgnoreCase(username)){
                return users[i];
            }
        }return null;
    }


            }


package shild.taskManagment.storage;

import shild.taskManagment.SerializeUtill;
import shild.taskManagment.exception.UserNotFoundException;
import shild.taskManagment.model.User;

import java.io.File;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

public class UserStorage  {
    private Map<String, User> users = new HashMap<>();


    public void add(User user) throws IOException {

        users.put(user.getEmail(), user);
        try {

            SerializeUtill.serializeUserMap(users);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void printUsers() throws IOException, ClassNotFoundException {
        for (User user : users.values()) {
            System.out.println(user);
        }
    }

    public User getUserByEmail(String email){
        return users.get(email);
    }
    public void upDateUsers(){
        File file=new File(SerializeUtill.USER_FILE_PATH);
        if (file.exists()){
            try
            {
                users=SerializeUtill.deserializeUserMap();
            }catch (IOException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
        }else {
            try {
                file.createNewFile();
            }catch (IOException e){
                System.out.println("cant created file for users");
            }
        }
    }


}

package shild.taskManagment;

import shild.taskManagment.model.Comment;
import shild.taskManagment.model.Project;
import shild.taskManagment.model.Task;
import shild.taskManagment.model.User;
import java.io.*;
import java.util.List;
import java.util.Map;

public class SerializeUtill {
    public static final String USER_FILE_PATH="src\\files\\users";
    public static final String PROJECT_FILE_PATH="src\\files\\projects";
    public static final String COMMENT_FILE_PATH="src\\files\\comments";
    public static final String TASKS_FILE_PATH="src\\files\\tasks";

    public static void serializeUserMap(Map<String, User> userMap) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(USER_FILE_PATH));
        out.writeObject(userMap);
        out.close();
    }

    public static Map<String, User> deserializeUserMap() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(USER_FILE_PATH));
return (Map<String, User>) in.readObject();
    }
    public static void serializeProject(List<Project> projects) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(PROJECT_FILE_PATH));
        oos.writeObject(projects);
        oos.close();
    }
    public static List<Project> deSerializeProject() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(PROJECT_FILE_PATH));
        return (List<Project>) ois.readObject();
    }

    public static void serializeComments( Map<Task, List<Comment>> comments) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(COMMENT_FILE_PATH));
        oos.writeObject(comments);
        oos.close();

    }
    public static Map<Task, List<Comment>> deSerializeComments() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(COMMENT_FILE_PATH));
        return (Map<Task, List<Comment>>) ois.readObject();
    }
    public static void serializeTask( List<Task> tasks) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(TASKS_FILE_PATH));
        oos.writeObject(tasks);
        oos.close();

    }
    public static List<Task> deSerializeTask() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(TASKS_FILE_PATH));
        return (List<Task>) ois.readObject();
    }

}

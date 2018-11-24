package shild.taskManagment.storage;

import shild.taskManagment.SerializeUtill;
import shild.taskManagment.model.Comment;
import shild.taskManagment.model.Task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javafx.scene.input.KeyCode.T;

public class CommentStorage {
    Map<Task, List<Comment>> comments = new HashMap<>();

    public void addComment(Task task, Comment comment) throws IOException {
        if (comments.get(task) == null) {
            List<Comment> commentList = new ArrayList<>();
            commentList.add(comment);
            comments.put(task, commentList);
            SerializeUtill.serializeComments(comments);
        } else {
            comments.get(task).add(comment);
            SerializeUtill.serializeComments(comments);
        }

    }

    public void printCommentsByTask( String task) {
        for (Task task1 : comments.keySet()) {
            if (task1.getTitle().equalsIgnoreCase(task)) {
                for (List<Comment> commentList : comments.values()) {
                    for (Comment comment : commentList) {
                        System.out.println(comment.getText());
                    }
                }
            }
        }


    }


    public void printAllComments() {
        for (List<Comment> commentList : comments.values()) {
            for (Comment comment : commentList) {
                System.out.println(comment.getText());
            }
        }


    }
    public void upDateComments() throws ClassNotFoundException, IOException {
        File f=new File(SerializeUtill.COMMENT_FILE_PATH);
        if (f.exists()){
            try {
                comments= (Map<Task, List<Comment>>) SerializeUtill.deSerializeComments();
            }catch (IOException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
        }else {
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println("cant created file for Projects");
            }
        }
    }
}
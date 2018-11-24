package shild.taskManagment.storage;

import shild.taskManagment.SerializeUtill;
import shild.taskManagment.model.Task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private List<Task>tasks=new ArrayList<>();

    public void add(Task task){
        tasks.add(task);
        try {

            SerializeUtill.serializeTask(tasks);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void printTasks(){
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void printTaskByStatus(String status){
        for (Task task : tasks) {
            if (task.getStatus().equalsIgnoreCase(status)){
                System.out.println(task);
            }
        }
    }
    public Task getTaskByTitle(String title){
        for (Task task : tasks) {
            if (task.getTitle().equals(title)){
                return task;
            }
        }return null;
    }

    public void printTaskByEmail(String email) {
        for (Task task : tasks) {
            if (task.getAssignTo().equalsIgnoreCase(email)){
                System.out.println(task);
            }
        }
    }

    public void printTasksByemailAndStatus(String status,String email){
        for (Task task : tasks) {
            if (task.getStatus().equalsIgnoreCase(status)&&task.getAssignTo().equalsIgnoreCase(email)){
                System.out.println(task);
            }
        }
    }

    public void changeMyTaskStatusByTitle(String status, String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                task.setStatus(status);
            }
        }
    }

    public void changeTasEstimationkByTitle(long change,String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)){
                task.setEstimate(change);
            }
        }
    }
    public void upDateTasks() throws ClassNotFoundException, IOException {
        File f=new File(SerializeUtill.TASKS_FILE_PATH);
        if (f.exists()){
            try {
                tasks=SerializeUtill.deSerializeTask();
            }catch (IOException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }
        }else {
            try {
                f.createNewFile();
            } catch (IOException e) {
                System.out.println("cant created file for task");
            }
        }
    }
}

package shild.taskManagment.storage;

import shild.taskManagment.SerializeUtill;
import shild.taskManagment.model.Project;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectStorage {
    private List<Project> projects = new ArrayList<>();

    public void add(Project project) throws IOException {
        projects.add(project);
        try {

            SerializeUtill.serializeProject(projects);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void printAllProjects() {
        for (Project project : projects) {
            System.out.println(project);
        }
    }

    public Project getProjectByName(String name) {
        for (Project project : projects) {
            if (project.getName().equalsIgnoreCase(name) && project.getName() != null) {
                return project;

            }

        }
        return null;
    }
    public void upDateProjects() throws ClassNotFoundException, IOException {
        File f=new File(SerializeUtill.PROJECT_FILE_PATH);
        if (f.exists()){
            try {
                projects=SerializeUtill.deSerializeProject();
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

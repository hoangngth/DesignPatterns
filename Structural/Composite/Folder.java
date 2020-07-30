package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {

    // List is interface of ArrayList, LinkedList, Vector
    private List<FileComponent> files = new ArrayList<FileComponent>();
    private String name;

    public Folder(String name, List<FileComponent> files) {
        this.name = name;
        this.files = files;
    }

    @Override
    public void showProperties() {
        System.out.println("Folder: " + name);
        showChildFiles();
    }

    private void showChildFiles() {
        for (FileComponent file : files) {
            file.showProperties();
        }
    }
    
}
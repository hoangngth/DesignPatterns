package Structural.Composite;

import java.util.Arrays;
import java.util.List;

public class FileExplorer {
    
    public static void main(String[] args) {

        FileComponent file1 = new File("file1", 1000);
        FileComponent file2 = new File("file2", 12454);
        FileComponent file3 = new File("file1", 8523);

        List<FileComponent> folder1_files = Arrays.asList(file1, file2);
        FileComponent folder1 = new Folder("folder1", folder1_files);

        List<FileComponent> folder2_files = Arrays.asList(file3, folder1);
        FileComponent folder2 = new Folder("folder2", folder2_files);
        folder2.showProperties();
    }
}
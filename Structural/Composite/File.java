package Structural.Composite;

public class File implements FileComponent {

    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showProperties() {
        System.out.println("File: " + name + ". Size: " + size);
    }
    

}
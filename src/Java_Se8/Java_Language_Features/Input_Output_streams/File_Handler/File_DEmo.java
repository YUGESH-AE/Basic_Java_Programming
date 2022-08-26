package Java_Se8.Java_Language_Features.Input_Output_streams.File_Handler;

import java.io.File;
import java.io.IOException;

public class File_DEmo {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\ylnu\\IdeaProjects\\Basic_Java_Programming\\src\\Se8.Java_Language_Features\\Generics_Wildcards\\Input_Output_streams\\File_Handler\\file.txt");
        boolean isCreated= file.createNewFile();
        System.out.println("File created: " + isCreated);
        System.out.println("Name of the file: " + file.getName());
        System.out.println("Path of the file: " + file.getPath());
        System.out.println("isDirectory: " + file.isDirectory());
        System.out.println("list: " + file.list());
    }
}

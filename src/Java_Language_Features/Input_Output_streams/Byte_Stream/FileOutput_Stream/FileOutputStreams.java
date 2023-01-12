package Java_Language_Features.Input_Output_streams.Byte_Stream.FileOutput_Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreams {

    public static void main(String[] args) {

        try(FileOutputStream  out=new FileOutputStream("C:\\Users\\ylnu\\IdeaProjects\\Basic_Java_Programming\\src\\Se8.Java_Language_Features\\Generics_Wildcards\\Input_Output_streams\\Byte_Stream\\FileOutput_Stream\\candidate.txt");) {

            String a="I am a good boy";
            byte[]b=a.getBytes();
            out.write(b);
            System.out.println("Writing successfully done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

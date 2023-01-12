package Java_Language_Features.Input_Output_streams.Byte_Stream.FileInput_Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreams {
    public static void main(String[] args) {
        try( FileInputStream in=new FileInputStream("C:\\Users\\ylnu\\IdeaProjects\\Basic_Java_Programming\\src\\Se8.Java_Language_Features\\Generics_Wildcards\\Input_Output_streams\\Byte_Stream\\FileInput_Stream\\candidate.txt");) {

            int i= in.read();
            while (i!=-1){
                System.out.print((char) i);
                i=in.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

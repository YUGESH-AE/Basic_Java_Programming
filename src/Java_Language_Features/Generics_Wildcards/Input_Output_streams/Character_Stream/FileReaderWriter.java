package Java_Language_Features.Generics_Wildcards.Input_Output_streams.Character_Stream;

import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) {

        try(FileReader read=new FileReader("C:\\Users\\ylnu\\IdeaProjects\\Basic_Java_Programming\\src\\Java_Language_Features\\Generics_Wildcards\\Input_Output_streams\\Character_Stream\\pom.txt");
            FileWriter write=new FileWriter("C:\\Users\\ylnu\\IdeaProjects\\Basic_Java_Programming\\src\\Java_Language_Features\\Generics_Wildcards\\Input_Output_streams\\Character_Stream\\pom.txt");
            BufferedReader r=new BufferedReader(read);
            BufferedWriter w=new BufferedWriter(write);)
        {
            String wr="I am a Billionaire, working in Amazon as a Pro Java Developer";
            w.write(wr);
            System.out.println("Writing done");

            int i= r.read();
            char c=(char) r.read();
            while (i!=-1){
                System.out.println(c);
                i= r.read();
            }
            System.out.println("Reading done");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package Java_Language_Features.Generics_Wildcards.Input_Output_streams.InputStreamReader_OutputStreamWriter;

import java.io.*;

public class TestStreamReader_Writer {
    public static void main(String[] args) {

        try (BufferedWriter w=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\ylnu\\IdeaProjects\\Basic_Java_Programming\\src\\Java_Language_Features\\Generics_Wildcards\\Input_Output_streams\\InputStreamReader_OutputStreamWriter\\super.txt")));
            BufferedReader r=new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\ylnu\\IdeaProjects\\Basic_Java_Programming\\src\\Java_Language_Features\\Generics_Wildcards\\Input_Output_streams\\InputStreamReader_OutputStreamWriter\\super.txt")));){

            String string="\\u0c87\\u0ca8\\u0ccd\\u0cab\\u0cc6\\u0cc2\\u0cd5\\u0cb8\\u0cbf\\u0cb8\\u0ccd";
            w.write(string);
            System.out.println("Writing successfull");

            System.out.print("Data in the file is:");

            int data=r.read();
            while (data!=-1){
                System.out.println((char) data);
                data=r.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

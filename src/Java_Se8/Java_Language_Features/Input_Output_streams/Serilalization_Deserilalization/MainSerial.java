package Java_Se8.Java_Language_Features.Input_Output_streams.Serilalization_Deserilalization;

import java.io.*;
import java.util.HashSet;
import java.util.Set;


public class MainSerial {
    public static void main(String[] args) {
        Set<Course>c1=new HashSet<>();
        c1.add(new Course("Java"));
        c1.add(new Course("Spring"));

        Set<Course>c2=new HashSet<>();
        c2.add(new Course("Angular"));
        c2.add(new Course("React"));

        Student s1=new Student(101,"Ravi",c1,21);
        Student s2=new Student(102,"Rajesh",c2,20);

        try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("C:\\Users\\ylnu\\IdeaProjects\\Basic_Java_Programming\\src\\Se8.Java_Language_Features\\Generics_Wildcards\\Input_Output_streams\\Serilalization_Deserilalization\\student.bin"));
             ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\ylnu\\IdeaProjects\\Basic_Java_Programming\\src\\Se8.Java_Language_Features\\Generics_Wildcards\\Input_Output_streams\\Serilalization_Deserilalization\\student.bin"));){

            out.writeObject(s1);
            out.writeObject(s2);

            Student student1= (Student) in.readObject();
            Student student2= (Student) in.readObject();
            System.out.println(student1);
            System.out.println(student2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

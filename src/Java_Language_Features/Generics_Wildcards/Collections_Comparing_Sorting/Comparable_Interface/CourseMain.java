package Java_Language_Features.Generics_Wildcards.Collections_Comparing_Sorting.Comparable_Interface;

import java.util.ArrayList;

public class CourseMain {
    public static void main(String[] args) {

        ArrayList<Course2>c=new ArrayList<>();
        c.add(new Course2(105,"Java"));
        c.add(new Course2(101,"React"));
        c.add(new Course2(100,"Spring"));
        c.add(new Course2(107,"Angular"));
        //Lambda expression
       // c.sort((n1,n2)->n1.getCourseName().compareTo(n2.getCourseName()));

        for (Course2 i:c){
            System.out.println(i);
        }
    }
}


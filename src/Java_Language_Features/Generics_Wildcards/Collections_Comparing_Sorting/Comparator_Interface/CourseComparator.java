package Java_Language_Features.Generics_Wildcards.Collections_Comparing_Sorting.Comparator_Interface;

import Java_Language_Features.Generics_Wildcards.Collections_Comparing_Sorting.Comparable_Interface.Course2;

import java.util.ArrayList;
import java.util.Collections;

public class CourseComparator {
    public static void main(String[] args) {
        ArrayList<Course2> c=new ArrayList<>();
        c.add(new Course2(105,"Java"));
        c.add(new Course2(101,"React"));
        c.add(new Course2(100,"Spring"));
        c.add(new Course2(107,"Angular"));

        Collections.sort(c);
        //lambda comparator interface
       // c.sort((n1,n2)-> n1.getCourseId()- n2.getCourseId());
        for (Course2 i:c){
            System.out.println(i);
        };
    }
}

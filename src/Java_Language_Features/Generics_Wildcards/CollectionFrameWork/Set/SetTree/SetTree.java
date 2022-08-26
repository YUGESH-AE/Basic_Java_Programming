package Java_Language_Features.Generics_Wildcards.CollectionFrameWork.Set.SetTree;

import java.util.Objects;
import java.util.TreeSet;

public class SetTree {
    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<>();
        try {
            students.add("Ravi");
            students.add("Aishwarya");
            students.add("Ravi");
            students.add("Yugesh");
            //null value is not allowed in treeset
//        students.add(null);

            for (String i : students
            ) {
                System.out.println(i);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getName());
        }
    }
}

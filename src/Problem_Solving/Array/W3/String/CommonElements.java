package Problem_Solving.Array.W3.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/**
 * Find the common elements between two arrays
 */
public class CommonElements {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        Common<String> common1 = new Common<>();
        common1.commonElements(array1, array2);
    }

}

class Common<T> {

    public void commonElements(T[] a, T[] b) {
        System.out.println("original Elements: of a::" + Arrays.toString(a));
        System.out.println("original Elements: of b::" + Arrays.toString(b));

        Set<T> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    set.add(a[i]);
                }
            }
        }
        System.out.println("Common Elements::" + Set.of(set));
    }
}
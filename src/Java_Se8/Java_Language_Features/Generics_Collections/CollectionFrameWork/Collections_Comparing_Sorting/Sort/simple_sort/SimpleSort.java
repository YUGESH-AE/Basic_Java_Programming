package Java_Se8.Java_Language_Features.Generics_Collections.CollectionFrameWork.Collections_Comparing_Sorting.Sort.simple_sort;

import java.util.ArrayList;
import java.util.Collections;

public class SimpleSort {
    public static void main(String[] args) {
        ArrayList<String> company=new ArrayList<>();
        company.add("IBM");
        company.add("Google");
        company.add("Amazon");
        company.add("Microsoft");
        company.add("Apple");
        company.add("Netflix");
        Collections.sort(company);
        for (String i:company){
            System.out.println(i);
        }
    }
}

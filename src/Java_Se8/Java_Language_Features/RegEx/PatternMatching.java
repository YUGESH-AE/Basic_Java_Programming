package Java_Se8.Java_Language_Features.RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the mobile no");
        String no=scanner.next();
        System.out.println("The nowhich match or does not match:"+evaluvate(no));
    }
    public static boolean evaluvate(String phoneNo){
        Pattern regex=Pattern.compile("\\d{3}-\\d{3}-\\d{3}");
        Matcher matching= regex.matcher(phoneNo);
        return matching.matches();
    }
}

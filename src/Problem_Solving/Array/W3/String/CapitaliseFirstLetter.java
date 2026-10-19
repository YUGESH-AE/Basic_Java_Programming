package Problem_Solving.Array.W3.String;

/**
 * Capitalize the first letter of each word in a sentence
 */
public class CapitaliseFirstLetter {
    public static void main(String[] args) {
//        String upper = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String");
//        String s1 = sc.nextLine();
//        Scanner scanner = new Scanner(s1);
//        while (scanner.hasNext()) {
//            String word = scanner.next();
//            upper += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
//        }
//        System.out.println(upper.trim());
        String c = " the quick brown fox jumps over the lazy dog";
        capitalizeFirst(c.trim());

    }

    public static void capitalizeFirst(String str) {
        System.out.println("Original::" + str);
        String[] sarr = str.split(" ");
        String capital = "";
        for (String i : sarr) {
            capital += capital(i);
        }
        System.out.println("Capital::" + capital);
    }

    private static String capital(String s) {
        String c = "";
        c += Character.toUpperCase(s.charAt(0)) + s.substring(1) + " ";
        return c;
    }
}

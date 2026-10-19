package Problem_Solving.String.W3;


public class StringContentEquals {
    public static void main(String[] args) {

        /**
         * Compare a given string to the specified character sequence
         *
         * rite a Java program to compare a given string to the specified character sequence.
         */
        String str1 = "example.com", str2 = "Example.com";
        CharSequence cs = "example.com";
        System.out.println("Comparing " + str1 + " and " + cs + ": " + str1.contentEquals(cs));
        System.out.println("Comparing " + str2 + " and " + cs + ": " + str2.contentEquals(cs));


        /**
         * Create a new String object with the contents of a character array
         *
         * Write a Java program to create a new String object with the contents of a character array.
         */
        char[] a = {'1', '2', '3', '4', '5'};

        String b = String.valueOf(a, 1, 3);
        System.out.println(b);

        /**
         * Check whether a given string starts with the contents of another string
         */

        String str3 = "Python Exercises";
        String str4 = "Python Exercise";

        // The String to check the above two Strings to see
        // if they end with this value (se).
        String end_str = "se";

        // Check first two Strings end with end_str
        boolean ends1 = str3.startsWith(end_str);
        boolean ends2 = str4.startsWith(end_str);

        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " +
                "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " +
                "\"" + end_str + "\"? " + ends2);

        /**
         * Check whether a given string ends with the contents of another string
         */
        String str5 = "Python Exercises";
        String str6 = "Python Exercise";

        // The String to check the above two Strings to see
        // if they end with this value (se).
        String end_str1 = "se";

        // Check first two Strings end with end_str
        boolean ends3 = str1.endsWith(end_str1);
        boolean ends4 = str2.endsWith(end_str1);

        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " +
                "\"" + end_str1 + "\"? " + ends3);
        System.out.println("\"" + str2 + "\" ends with " +
                "\"" + end_str1 + "\"? " + ends4);
    }

}

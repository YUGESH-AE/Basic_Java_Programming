package Java_Se8.Java_Fundamentals.Lang;

public class StringClass {
    public static void main(String[] args) {
        //concat method
        String str1 = "hello";
        String str2 = "world";
        System.out.println(str1.concat(str2));
        System.out.println(str1 + str2);

        //equals method
        String a = new String("programmer");
        String b = new String("programmer");
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.compareTo(b));

        //charAt
        String str = "studytonight";
        System.out.println(str.charAt(2));

        //equalsIgnore case
        String st1 = "java";
        System.out.println(st1.equalsIgnoreCase("JAVA"));

        //subString
        String str3 = "0123456789";
        System.out.println(str3.substring(4));
        System.out.println(str3.substring(4, 7));

        //Value of method
        int num = 35;
        String s1 = String.valueOf(num);    //converting int to String
        System.out.println(s1);
        System.out.println("type of num is: " + s1.getClass().getName());

        //trim
        String st4 = "   hello  ";
        System.out.println(st4.trim());

        //contains
        String a1 = "Hello welcome to studytonight.com";
        boolean b1 = a1.contains("studytonight.com");
        System.out.println(b1);
        System.out.println(a1.contains("javatpoint"));

        //endwith
        String a2="Hello welcome to studytonight.com";
        System.out.println(a2.endsWith("m"));
        System.out.println(a2.endsWith("com"));

        //get bytes
        String a3="studytonight";
        byte[] b3=a3.getBytes();
        for(int i=0;i<b3.length;i++)
        {
            System.out.println(b3[i]);
        }

        //getchars
        String a4= new String("Hello Welcome to studytonight.com");
        char[] ch = new char[16];
        try
        {
            a4.getChars(6, 12, ch, 0);
            System.out.println(ch);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }


    }
}

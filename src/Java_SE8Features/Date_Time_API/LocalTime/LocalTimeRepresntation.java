package Java_SE8Features.Date_Time_API.LocalTime;

import java.time.LocalTime;

public class LocalTimeRepresntation {
    public static void main(String[] args) {
        LocalTime a=LocalTime.now();
        System.out.println(a);
        LocalTime b=LocalTime.of(3,45,2);
        System.out.println(b);

        LocalTime c=a.plusHours(10);
        System.out.println(c);
        LocalTime d=a.plusMinutes(23);
        System.out.println(d);
        LocalTime e=a.plusSeconds(21);
        System.out.println(e);
        int v=LocalTime.now().compareTo(LocalTime.of(4,34,34));
        System.out.println(v);
    }
}

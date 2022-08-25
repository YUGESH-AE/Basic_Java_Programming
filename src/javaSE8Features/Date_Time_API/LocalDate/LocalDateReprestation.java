package javaSE8Features.Date_Time_API.LocalDate;




import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateReprestation {
    public static void main(String[] args) {
        LocalDate a=LocalDate.now();

        System.out.println(a);
        LocalDate b=LocalDate.now().plusDays(10);
        System.out.println(b);
        LocalDate c=LocalDate.now().plusMonths(13);
        System.out.println(c);
        LocalDate d=LocalDate.now().plusYears(10);
        System.out.println(d);


    }
}

package Java_Se8.javaSE8Features.Date_Time_API.DateTimeFormatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDate paySlipDate = LocalDate.now();
        System.out.println(paySlipDate);                                             // Output: 2016-11-21
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(paySlipDate.format(formatter));                           // Output: 21/Nov/2016

    }
}

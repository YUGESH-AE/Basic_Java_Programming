package Java_SE8Features.Date_Time_API.LocalDate.RemainderMail;

import java.time.LocalDate;

public class Remainder {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate future=LocalDate.now().plusDays(3);
        if(today.isAfter(future)){
            System.out.println("Time to write the course");
        }
    }
}

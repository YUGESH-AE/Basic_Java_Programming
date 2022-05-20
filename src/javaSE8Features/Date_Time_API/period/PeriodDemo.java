package javaSE8Features.Date_Time_API.period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {

        LocalDate a=LocalDate.now();
        LocalDate b=LocalDate.of(1999,8,20);
        Period p=Period.between(b,a);
        System.out.println(p.getDays());
        System.out.println(p.getMonths());
        System.out.println(p.getYears());
    }
}

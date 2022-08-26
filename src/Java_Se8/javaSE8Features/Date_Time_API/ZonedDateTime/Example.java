package Java_Se8.javaSE8Features.Date_Time_API.ZonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example {
    public static void main(String[] args) {

        System.out.println(ZonedDateTime.now());
        System.out.println();
        System.out.println(ZonedDateTime.now().getZone());

        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/Athens")));
    }
}

package javaSE8Features.Date_Time_API.Local_Date_Time_Excercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demonstrator {

    public static void main (String[] args) {
        System.out.println("*****LocalDate*****");
        LocalDate registrationDate = LocalDate.now(); //Creates an object with system date
        System.out.println("Today's date(System date): "+registrationDate);
        LocalDate lastDate = registrationDate.plusDays(3);    // Adding 3 days to the registration date
        System.out.println("Adding 3 days: "+lastDate);
        if(LocalDate.now().isBefore(lastDate)) {               // Checking whether current date is before the last date
            System.out.println("Please take the assessment as soon as possible");
        }
        System.out.println();
        System.out.println("*****LocalTime*****");
        LocalTime startTime = LocalTime.now(); //Creates an object with system time
        System.out.println("Start Time: "+startTime);  //The time being returned here is according to the region/locale/zone in which the application is hosted.

        LocalTime endTime = startTime.plusHours(1); //Adding 1 hour
        System.out.println("End Time: "+endTime);  //The time being returned here is according to the region/locale/zone in which the application is hosted.

        LocalTime current = LocalTime.now();
        int hour = current.getHour();              // Getting the hours, minutes and seconds components
        int minute = current.getMinute();
        int second = current.getSecond();
        System.out.println("Hour: "+hour+" Minute: "+minute+" Second: "+second);  //The time being returned here is according to the region/locale/zone in which the application is hosted.

        System.out.println();
        System.out.println("*****LocalDateTime*****");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and Time: "+dateTime);  //The time being returned here is according to the region/locale/zone in which the application is hosted.
        System.out.println(dateTime.minusDays(3));      // Subtracting 3 days and output time is in ETC
        //Run the above program in your system in order to see the difference
    }
}

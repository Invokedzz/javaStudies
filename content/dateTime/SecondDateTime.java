package content.dateTime;

import java.time.LocalTime;

import java.time.LocalDateTime;

import java.time.LocalDate;

public class SecondDateTime {

    public static void main (String[] args) {

        LocalTime firstElement = LocalTime.now();

        LocalDate secondElement = LocalDate.now();

        LocalDateTime thirdElement = LocalDateTime.now();

        LocalTime fourthElement = LocalTime.parse("10:15:30"); // LocalTime parse format -> 20:03:22 (for example)

        LocalDate fifthElement = LocalDate.parse("2005-08-10");

        LocalDateTime sixthElement = LocalDateTime.parse("2008-08-10T03:10:22");

        System.out.println(firstElement);

        System.out.println(secondElement);

        System.out.println(thirdElement);

        System.out.println(fourthElement);

        System.out.println(fifthElement);

        System.out.println(sixthElement);

        // LocalDate -> year, month, day;

        // LocalTime -> minutes, seconds, milliseconds

        // LocalDateTime -> LocalDate + LocalTime;

    }

}

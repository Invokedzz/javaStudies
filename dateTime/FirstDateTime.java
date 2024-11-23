package dateTime;

import java.time.LocalDate;

import java.time.LocalTime;

public class FirstDateTime {

    public static void main (String[] args) {

        LocalDate randomObj = LocalDate.now(); // Create a date object;

        System.out.println(randomObj); // Display the current data -> 2024-11-22

        showLocalTime();

    }

    private static void showLocalTime () {

        LocalTime somethingElse = LocalTime.now(); // Create the time object;

        System.out.println(somethingElse); // Display the current time -> 11:03:19 (hours, minutes, seconds).

    }

}

package dateTime;

import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.LocalTime;

public class FirstDateTime {

    public static void main (String[] args) {

        LocalDate randomObj = LocalDate.now(); // Create a date object;

        System.out.println(randomObj); // Display the current data -> 2024-11-22

        showLocalTime();

        showLocalDateTime();

    }

    private static void showLocalTime () {

        LocalTime somethingElse = LocalTime.now(); // Create the time object;

        LocalTime randomValue = somethingElse.plusSeconds(1); // Method to add some seconds;

        System.out.println(somethingElse); // Display the current time -> 11:03:19 (hours, minutes, seconds).

    }

    private static void showLocalDateTime () {

        LocalDateTime randomVariable = LocalDateTime.now(); // Create the LocalDateTime object;

        System.out.println(randomVariable); // Display the current time, but also the hours, minutes and seconds.

    }

}

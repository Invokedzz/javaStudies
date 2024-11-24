package chronos.entities;

import java.time.LocalDate;

import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

public class ChronosDate {

    public static void showDateWithChronos () {

        dateByChronos();

    }

    public static void showTimeWithChronos () {

        timeByChronos();

    }

    private static void dateByChronos () {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.now();

        String registeredElement = date.format(formatter);

        System.out.println(registeredElement);

    }

    private static void timeByChronos () {

        LocalTime time = LocalTime.now();

        System.out.println(time);

    }

}

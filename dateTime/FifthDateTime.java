package dateTime;

import java.time.format.DateTimeFormatter;

import java.time.LocalTime;

import java.time.LocalDateTime;

import java.time.LocalDate;

import java.time.Month;

import java.time.ZoneId;

public class FifthDateTime {

    public static void main (String[] args) {

        workingWithLocalDate();

        workingWithLocalDateTime();

    }

    private static void workingWithLocalDate () {

        LocalDate date = LocalDate.parse("2024-09-10");

        Month getMonth = date.getMonth();

        System.out.println(getMonth);

    }

    private static void workingWithLocalDateTime () {

        LocalDateTime dateTime = LocalDateTime.parse("2024-09-10T01:10:20");

    }

}

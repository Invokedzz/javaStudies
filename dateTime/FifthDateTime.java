package dateTime;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

import java.time.LocalDate;

import java.time.Instant;

import java.time.Month;

import java.time.ZoneId;

public class FifthDateTime {

    public static void main (String[] args) {

        workingWithLocalDate();

        workingWithLocalDateTime();

        workingWithZoneId();

    }

    private static void workingWithLocalDate () {

        LocalDate date = LocalDate.parse("2024-09-10");

        Month getMonth = date.getMonth();

        int getYear = date.getYear();

        System.out.printf("%s and %s \n", getYear, getMonth);

    }

    private static void workingWithLocalDateTime () {

        LocalDateTime dateTime = LocalDateTime.parse("2024-09-10T01:10:20");

        int getHour = dateTime.getHour();

        System.out.println(getHour);

    }

    private static void workingWithZoneId() {

        Instant date = Instant.parse("2007-12-03T03:10:15Z");

        LocalDate zoneAnalysis = LocalDate.ofInstant(date, ZoneId.systemDefault());
        // Display the date according to the user system of date.

        System.out.println(zoneAnalysis);

        LocalDate anotherZoneAnalysis = LocalDate.ofInstant(date, ZoneId.of("Asia/Tokyo"));

        System.out.println(anotherZoneAnalysis);

    }


}

package dateTime;

import java.time.Instant;

import java.time.Duration;

import java.time.LocalDate;

import java.time.ZoneId;

import java.time.temporal.ChronoUnit;

public class MinusPlusDateTime {

    public static void main (String[] args) {

        workingWithLocalDate();

        workingWithInstant();

        workingWithDuration();

    }

    private static void workingWithLocalDate () {

        LocalDate date = LocalDate.parse("2009-02-10");

        LocalDate pastWeekElement = date.minusDays(7);

        LocalDate futureElement = date.plusYears(10);

        System.out.printf("%s and %s \n", pastWeekElement, futureElement);

    }

    private static void workingWithInstant () {

        Instant element = Instant.parse("2007-12-03T10:15:30.00Z");

        Instant nextWeek = element.plus(7, ChronoUnit.DAYS);

        Instant nextYear = element.plus(22, ChronoUnit.MILLIS);

        System.out.printf("%s and %s ", nextWeek, nextYear);

    }

    private static void workingWithDuration () {

        LocalDate element = LocalDate.parse("2007-12-03");

        Instant nextWeekLOL = element.plusDays(7).atStartOfDay(ZoneId.systemDefault()).toInstant();
        
        Instant afterTwoWeeks = element.plusDays(14).atStartOfDay(ZoneId.systemDefault()).toInstant();

        Duration betweenTheElements = Duration.between(nextWeekLOL, afterTwoWeeks);

        System.out.println(betweenTheElements);

    }

}

package content.dateTime;

import java.time.LocalDate;

import java.time.LocalTime;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class FourthDateTime {

    public static void main (String[] args) {

        workingWithLocalDate();

        workingWithLocalTime();

        workingWithLocalDateTime();

    }

    private static void workingWithLocalDate () {

        LocalDate date = LocalDate.parse("2007-12-08");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter anotherFormatter = DateTimeFormatter.ISO_DATE;

        System.out.println(anotherFormatter.format(date));

        System.out.println(formatter.format(date));

    }

    private static void workingWithLocalTime () {

        LocalTime time = LocalTime.parse("10:15:30");

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;

        String gatherElements = formatter.format(time);

        System.out.println(gatherElements);

    }

    private static void workingWithLocalDateTime () {

        LocalDateTime dateTime = LocalDateTime.parse("2000-08-10T09:10:23");

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        String elements = formatter.format(dateTime);

        System.out.println(elements);

    }

}

package dateTime;

import java.time.LocalTime;

import java.time.LocalDateTime;

import java.time.LocalDate;

public class SecondDateTime {

    public static void main (String[] args) {

        LocalTime firstElement = LocalTime.now();

        LocalDate secondElement = LocalDate.now();

        LocalDateTime thirdElement = LocalDateTime.now();

        System.out.println(firstElement);

        System.out.println(secondElement);

        System.out.println(thirdElement);


    }

}

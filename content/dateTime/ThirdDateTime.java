package content.dateTime;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter; // Customs dates and stuff like that :)

public class ThirdDateTime {

    public static void main (String[] args) {

        DateTimeFormatter creatingPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate element = LocalDate.parse("08/12/2007", creatingPattern);

        System.out.println(element);

    }

}

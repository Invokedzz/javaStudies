package POO.somexercises.entities;

import java.time.LocalDate;

public class DateEntity {

    // day (int), month (int), year (int);

    private int day;

    private int month;

    private int year;

    public DateEntity (int day, int month, int year) {

        this.day = day;

        this.month = month;

        this.year = year;

    }

    public void setDay (int day) {

        if (day > 0 && day <= 31) {

            this.day = day;

            return;

        }

        System.out.println("Enter a valid day value!");

    }

    public void setMonth (int month) {

        if (month > 0 && month <= 12) {

            this.month = month;

            return;

        }

        System.out.println("Enter a valid month value!");

    }

    public void setYear (int year) {

        if (year > 0 && year <= LocalDate.now().getYear()) {

            this.year = year;

            return;

        }

        System.out.println("Enter a valid year!");

    }

    public String displayDate () {

        StringBuilder sb;
        sb = new StringBuilder();

        sb.append(day).append("/")
                .append(month).append("/")
                .append(year);

        return sb.toString();

    }

}

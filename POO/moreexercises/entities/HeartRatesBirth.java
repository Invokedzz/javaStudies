package POO.moreexercises.entities;

import java.time.LocalDate;

public class HeartRatesBirth {

    private int yearBirth;

    private int monthBirth;

    private int dayBirth;

    public HeartRatesBirth ( int yearBirth, int monthBirth, int dayBirth ) {

        this.dayBirth = dayBirth;

        this.monthBirth = monthBirth;

        this.yearBirth = yearBirth;

    }

    public void getUserAge () {

        

    }

    public int fcMaxCalculus () {

        return 220 - yearBirth;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append(dayBirth).append("/")
                .append(monthBirth).append("/")
                .append(yearBirth);

        return sb.toString();

    }

}

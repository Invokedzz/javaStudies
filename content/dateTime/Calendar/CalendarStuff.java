package content.dateTime.Calendar;

import java.time.Instant;
import java.util.Calendar;

import java.util.Date;

import java.text.SimpleDateFormat;

public class CalendarStuff {

    public static void main (String[] args) {

        creatingSomeCalendarThings();

    }

    private static void creatingSomeCalendarThings () {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date getDate = Date.from(Instant.parse("2023-09-10T10:10:40Z"));

        System.out.println(dateFormat.format(getDate));

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(getDate);

        calendar.add(calendar.HOUR_OF_DAY, 4);

        getDate = calendar.getTime();

        System.out.println(dateFormat.format(getDate));

    }

}

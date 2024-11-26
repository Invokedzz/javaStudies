package dateTime.Calendar;

import java.text.ParseException;
import java.util.Date;

import java.text.SimpleDateFormat;

public class OgDate {

    public static void main (String[] args) throws ParseException {

        SimpleDateFormat firstFormat = new SimpleDateFormat("yyyy/MM/dd");

        SimpleDateFormat secondFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date firstDate = new Date();

        System.out.println(firstFormat.format(firstDate));

        System.out.println(secondFormat.format(firstDate));

        // OG methods :)

    }

}

package dateTime.Calendar;

import java.text.ParseException;

import java.util.Date;

import java.text.SimpleDateFormat;

import java.util.Locale;

public class OgDateParse {

    public static void main (String[] args) throws ParseException {

        Locale.setDefault(Locale.ITALIAN);

        creatingDateStuff();

    }

    private static void creatingDateStuff () throws ParseException {

        Date firstElement = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(firstElement);

        Date idk = dateFormat.parse("10/08/2007");

        System.out.println(System.currentTimeMillis());

        System.out.println(idk);

    }

}

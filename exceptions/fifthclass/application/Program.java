package exceptions.fifthclass.application;

import exceptions.fifthclass.model.entities.Reservation;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Scanner;

import java.util.Date;

public class Program {

    public static void main ( String[] args ) throws ParseException {

        Scanner init = new Scanner ( System.in );

        mainOperations ( init );

    }

    private static void mainOperations ( Scanner init ) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd/MM/yyyy" );

        Date date = simpleDateFormat.parse( init.next());

        Date dateNumberTu = simpleDateFormat.parse( init.next() );

        Reservation reservation = new Reservation( 903, date, dateNumberTu );

        System.out.println( reservation );

    }

}

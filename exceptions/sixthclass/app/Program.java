package exceptions.sixthclass.app;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Scanner;

import java.util.Date;

import java.util.List;

import java.util.ArrayList;

import exceptions.sixthclass.model.entities.Reservations;

import exceptions.sixthclass.model.entities.ScannerValidate;

public class Program {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperations ( init );

    }

    private static void mainOperations ( Scanner init ) {

        List < Reservations > reservationsList = new ArrayList<>();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd/MM/yyyy" );

        int numberOfRooms = ScannerValidate.validateInt( init );

        try {

            for ( int index = 0; index < numberOfRooms; index ++ ) {

                // elements: roomNumber ( Integer ), checkIn ( Date ), checkOut ( Date )

                System.out.println( "Enter the room number: " );

                Integer roomNumber = ScannerValidate.validateInt( init );

                System.out.println( "Enter the check-in: " );

                Date checkIn = simpleDateFormat.parse( init.next() );

                System.out.println( "Enter the check-out: " );

                Date checkOut = simpleDateFormat.parse( init.next() );

                Reservations reservations = new Reservations( roomNumber, checkIn, checkOut );

                reservationsList.add( reservations );

            }

        } catch ( ParseException error ) {

            System.out.println( "Enter a valid date, dummy!" );

        } catch ( RuntimeException error ) {

            System.out.println(" Something went wrong." );

        }

        for ( Reservations reservations : reservationsList ) {

            System.out.printf( "Reservations: %s", reservations );

        }

    }

}

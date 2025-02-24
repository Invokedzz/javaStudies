package content.exceptions.fifthclass.application;

import content.exceptions.fifthclass.model.entities.Reservation;

import content.exceptions.fifthclass.model.exceptions.InvalidDatePeriod;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.List;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.Date;

public class Program {

    public static void main ( String[] args ) throws ParseException {

        Scanner init = new Scanner ( System.in );

        mainOperations ( init );

    }

    private static void mainOperations ( Scanner init ) {

        List < Reservation > reservationList = new ArrayList<>();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat( "dd/MM/yyyy" );

        System.out.println( "Enter the number of rooms you want to rent: " );

        int numberOfRooms = validateInt( init );

        try {

            for ( int index = 0; index < numberOfRooms; index ++ ) {

                System.out.println( "Enter the room number: " );

                Integer roomNumber = validateInt( init );

                System.out.println( "Enter the check-in: " );

                Date checkIn = simpleDateFormat.parse( init.next() );

                System.out.println( "Enter the check-out: " );

                Date checkOut = simpleDateFormat.parse( init.next() );

                validateDatePeriod( checkIn, checkOut );

                Reservation reservation = new Reservation( roomNumber, checkIn, checkOut );

                reservationList.add( reservation );

            }

            for ( int index = 0; index < reservationList.size(); index ++ ) {

            //    Date getCheckIn = reservationList.get( index ).getCheckIn();

            //    Date getCheckOut = reservationList.get( index ).getCheckOut();

                System.out.println( "Enter the updated check-in: " );

                Date updatedCheckIn = simpleDateFormat.parse( init.next() );

                System.out.println( "Enter the updated check-out: " );

                Date updatedCheckOut = simpleDateFormat.parse( init.next() );

                Reservation.updateDates( updatedCheckIn, updatedCheckOut );

            }

            for ( Reservation reservation : reservationList ) {

                System.out.printf( "Stats: %s ", reservation );

            }

        } catch ( ParseException error ) {

            System.out.println( "The parse was not done correctly. Try again!" );

            return;

        } catch ( InvalidDatePeriod error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

        System.out.println( "The registration was done successfully!" );

    }

    // if (date.after( dateNumberTu )) System.out.println("Hii"); // Handle this error

    private static void validateDatePeriod ( Date checkIn, Date checkOut ) throws InvalidDatePeriod {

        if ( checkIn.after( checkOut ) ) throw new InvalidDatePeriod( "Enter a valid date!" );

        System.out.println();

    }

    private static boolean hasNextInt ( Scanner init ) {

        return init.hasNextInt();

    }

    private static int validateInt ( Scanner init ) {

        while ( !hasNextInt( init ) ) {

            System.out.println( "Enter a valid number!" );

            init.next();

        }

        return init.nextInt();

    }

}
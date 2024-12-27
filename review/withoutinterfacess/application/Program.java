package review.withoutinterfacess.application;

import review.withoutinterfacess.model.services.*;

import review.withoutinterfacess.model.entities.*;

import review.withoutinterfacess.model.enums.*;

import review.withoutinterfacess.model.exceptions.*;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        runProgram ( sc );

    }

    private static void runProgram ( Scanner sc ) {

        List < MotorcycleRent > motorcycleRents = new ArrayList<>();

        LocalDateTime start = startOfTheRent( sc );

        LocalDateTime finish = endOfTheRent( sc );

        Vehicle vehicle = chooseVehicle( sc );

        MotorcycleRent motorcycleRent = new MotorcycleRent( start, finish, new Invoice(), vehicle );

    }

    private static LocalDateTime startOfTheRent ( Scanner sc ) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyy HH:mm" );

        return LocalDateTime.parse( sc.nextLine(), dateTimeFormatter );

    }

    private static LocalDateTime endOfTheRent ( Scanner sc ) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyy HH:mm" );

        return LocalDateTime.parse( sc.nextLine(), dateTimeFormatter );

    }

    private static Vehicle chooseVehicle ( Scanner sc ) {

        VehicleModel vehicleModel = VehicleModel.valueOf( sc.next() );

        VehicleColor vehicleColor = VehicleColor.valueOf( sc.next() );

        String id = cryptId( sc );

        return new Vehicle( vehicleModel, vehicleColor, id );

    }

    private static String cryptId ( Scanner sc ) {

        String input = sc.next();

        StringBuilder sb;

        sb = new StringBuilder();

        try {
                if ( input.length() == 4 ) {

                    for ( char digits : input.toCharArray() ) {

                        int value = Character.getNumericValue( digits );

                        int newValues = (value + 173) % 10;

                        sb.append( newValues );

                    }

                    char firstDigit = sb.charAt( 0 );

                    char secondDigit = sb.charAt( 1 );

                    char thirdDigit = sb.charAt( 2 );

                    char fourthDigit = sb.charAt( 3 );

                    sb.setCharAt( 0, fourthDigit );

                    sb.setCharAt( 1, secondDigit );

                    sb.setCharAt( 2, thirdDigit );

                    sb.setCharAt( 3, firstDigit );

                    return sb.toString();

                }

        } catch ( InvalidIdInputException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

        throw new InvalidIdInputException( "Id length must have 4 characters!" );

    }

}

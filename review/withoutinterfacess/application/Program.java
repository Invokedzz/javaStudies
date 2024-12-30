package review.withoutinterfacess.application;

import review.withoutinterfacess.model.services.*;

import review.withoutinterfacess.model.entities.*;

import review.withoutinterfacess.model.enums.*;

import review.withoutinterfacess.model.exceptions.*;

import java.time.format.DateTimeFormatter;

import java.time.LocalDateTime;

import java.util.Scanner;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        runProgram ( sc );

    }

    private static void runProgram ( Scanner sc ) {

        LocalDateTime start = startOfTheRent( sc );

        LocalDateTime finish = endOfTheRent( sc );

        Vehicle vehicle = chooseVehicle( sc );

        MotorcycleRent motorcycleRent = new MotorcycleRent( start, finish, new Invoice(), vehicle );

        motorcycleRent.validateDates();

        double valuePerHour = obtainValuePerHour( sc );

        ListOfRents listOfRents = new ListOfRents();

        RentalService rentalService = new RentalService( valuePerHour, new USTax() );

        rentalService.processInvoice( motorcycleRent );

        listOfRents.addElement( motorcycleRent, vehicle.getId() );

        System.out.println( motorcycleRent.getInvoice().getPayment() );

        System.out.println( motorcycleRent.getInvoice().totalPayment() );

    }

    private static LocalDateTime startOfTheRent ( Scanner sc ) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyy HH:mm" );

        System.out.println( "Enter the start of the rent: " );

        return LocalDateTime.parse( sc.nextLine(), dateTimeFormatter );

    }

    private static LocalDateTime endOfTheRent ( Scanner sc ) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyy HH:mm" );

        System.out.println( "Enter the end of the rent: " );

        return LocalDateTime.parse( sc.nextLine(), dateTimeFormatter );

    }

    private static Vehicle chooseVehicle ( Scanner sc ) {

        // IllegalArgumentException

        System.out.println( "Enter the model of the vehicle: " );

        VehicleModel vehicleModel = VehicleModel.valueOf( sc.next() );

        System.out.println( "Enter the color of the vehicle: " );

        VehicleColor vehicleColor = VehicleColor.valueOf( sc.next() );

        String id = cryptId( sc );

        return new Vehicle( vehicleModel, vehicleColor, id );

    }

    private static String cryptId ( Scanner sc ) {

        System.out.println( "Enter the id of this chosen vehicle: " );

        String input = sc.next();

        StringBuilder sb;

        sb = new StringBuilder();

        try {
                if ( input.length() == 4 ) {

                    for ( char digits : input.toCharArray() ) {

                        int value = Character.getNumericValue( digits );

                        int newValues = ( value + 173 ) % 10;

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

            throw new InvalidIdInputException( "Id length must have 4 characters!" );

        } catch ( InvalidIdInputException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

        return "";

    }

    private static double obtainValuePerHour ( Scanner sc ) {

        ValueTreatments valueTreatments = new ValueTreatments();

        return valueTreatments.verifyInputForDouble( sc );

    }

}

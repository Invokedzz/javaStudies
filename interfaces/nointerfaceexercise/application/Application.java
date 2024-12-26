package interfaces.nointerfaceexercise.application;

import interfaces.nointerfaceexercise.model.entities.CarRental;
import interfaces.nointerfaceexercise.model.entities.Invoice;
import interfaces.nointerfaceexercise.model.entities.Vehicle;
import interfaces.nointerfaceexercise.model.services.BrazilTaxService;
import interfaces.nointerfaceexercise.model.services.RentalService;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Application {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner ( System.in );

        initProgram ( sc );

    }

    private static void initProgram ( Scanner sc ) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyyy HH:mm" );

        System.out.println( "Start: " );

        LocalDateTime start = LocalDateTime.parse( sc.next(), dateTimeFormatter );

        System.out.println( "Finish: " );

        LocalDateTime finish = LocalDateTime.parse( sc.next(), dateTimeFormatter );

        System.out.println( "Car Model: " );

        String model = sc.next();

        CarRental carRental = new CarRental( start, finish, new Invoice(), new Vehicle( model ));

        Double pricePerHour = sc.nextDouble();

        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService( pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice( carRental );

        System.out.println( carRental.getVehicle() );

        System.out.println( carRental.getInvoice().getTax() );

        System.out.println( carRental.getInvoice().getTotalPayment() );

    }

}

package interfaces.nointerfaceextwo.application;

import interfaces.nointerfaceextwo.model.entities.*;

import interfaces.nointerfaceextwo.model.services.*;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner ( System.in );

        programInitializer ( sc );

    }

    private static void programInitializer ( Scanner sc ) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyyy HH:mm" );

        LocalDateTime start = LocalDateTime.parse( sc.nextLine(), dateTimeFormatter );

        LocalDateTime finish = LocalDateTime.parse( sc.nextLine(), dateTimeFormatter );

        Invoice invoice = new Invoice(0.0, 0.0);

        CarRental carRental = new CarRental( start, finish, invoice, new Vehicle() );

        RentalService rentalService = new RentalService(100.0, 10.0, new BrazilTaxService() );

        rentalService.processInvoice( carRental );

        System.out.println( invoice.totalPayment() );

    }

}

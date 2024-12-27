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

        CarRental carRental = new CarRental( start, finish, new Invoice(), new Vehicle() );

        RentalService rentalService = new RentalService(100.0, 10.0, new BrazilTaxService() );

        rentalService.processInvoice( carRental );

        System.out.println( carRental.getInvoice().getBasicPayment() );

        System.out.println( carRental.getInvoice().getTax() );

        System.out.println( carRental.getInvoice().totalPayment() );

    }

}

package interfaces.src.application;

import interfaces.src.model.entities.*;

import interfaces.src.model.services.*;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        runTheProgramAsshole ( sc );

    }

    private static void runTheProgramAsshole ( Scanner sc ) {

        // 2007-12-03.

        LocalDate date = enterDate( sc );

        int number = enterNumber( sc );

        double totalValue = enterTotalValue( sc );

        int months = enterNumberOfMonths( sc );

        Contract contract = new Contract( date, number, totalValue );

        ContractService contractService = new ContractService( new PaypalService() );

        contractService.processContract( contract, months );

    }

    private static LocalDate enterDate ( Scanner sc ) {

        System.out.println( "Enter a date: " );

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyyy" );

        return LocalDate.parse( sc.next(), dateTimeFormatter );

    }

    private static int enterNumber ( Scanner sc ) {

        System.out.println( "Enter a number: " );

        return sc.nextInt();

    }

    private static double enterTotalValue ( Scanner sc ) {

        System.out.println( "Enter the total value: " );

        return sc.nextDouble();

    }

    private static int enterNumberOfMonths ( Scanner sc ) {

        System.out.println( "Enter number of months: " );

        return sc.nextInt();

    }

}

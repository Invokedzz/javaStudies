package interfaces.defaultinterfaces.application;

import interfaces.defaultinterfaces.services.*;

import java.util.Scanner;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner ( System.in );

        runProgram( sc );

    }

    private static void runProgram ( Scanner sc ) {

        double amount = sc.nextDouble();

        int months = sc.nextInt();

        InterestService interestService = new BrazilInterestService( 2.0 );

        double value = interestService.payment( amount, months );

        System.out.println( value );

    }

}

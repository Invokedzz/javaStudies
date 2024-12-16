package heritage.ahhmorestuff.application;

import heritage.ahhmorestuff.entities.TaxPayer;

import heritage.ahhmorestuff.entities.Company;

import heritage.ahhmorestuff.entities.Individual;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class App {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperation ( init );

    }

    private static void mainOperation ( Scanner init ) {

        List < TaxPayer > taxPayerList = new ArrayList<>();

        System.out.println( "Enter the number of tax payers: " );

        int numberOfPayments = init.nextInt();

        for ( int i = 0; i < numberOfPayments; i ++ ) {

            System.out.printf( "Tax payer #%s data: ", i + 1 );

            System.out.println( "Individual or company (i/c)?" );

            char individualOrCompany = init.next().charAt( 0 );

            System.out.println( "Name: " );

            String name = init.next();

            System.out.println( "Income: " );

            double income = init.nextDouble();

            if ( individualOrCompany == 'i' || individualOrCompany == 'I' ) {

                System.out.println( "Health expenditures: " );

                double healthExpenditures = init.nextDouble();

                taxPayerList.add( new Individual( name, income, healthExpenditures ) );

            }

            if ( individualOrCompany == 'c' || individualOrCompany == 'C' ) {

                System.out.println( "Number of employees: " );

                int numberOfEmployees = init.nextInt();

                taxPayerList.add( new Company( name, income, numberOfEmployees ) );

            }

        }

        for ( TaxPayer taxPayer : taxPayerList) {

            System.out.println( taxPayer );

        }

    }

}

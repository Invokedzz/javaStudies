package exceptions.seventhclass.application;

import exceptions.seventhclass.model.entities.Account;
import exceptions.seventhclass.model.exceptions.InvalidBalanceException;
import exceptions.seventhclass.model.exceptions.InvalidLimitException;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class Application {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperations ( init );

    }

    private static void mainOperations ( Scanner init ) {

        try {

            System.out.println( "Enter account data" );

            System.out.println( "Number: " );

            Integer number = init.nextInt();

            System.out.println( "Holder: " );

            String holder = init.next();

            System.out.println( "Initial Balance: " );

            double balance = init.nextDouble();

            System.out.println( "Withdraw Limit: \n" );

            Double withdrawLimit = init.nextDouble();

            Account account = new Account( number, holder, balance, withdrawLimit );

            System.out.println("Enter amount for withdraw: ");

            double amount = init.nextDouble();

            System.out.println( account.withdraw( amount ) );

        } catch ( InvalidBalanceException | InvalidLimitException error ) {

            System.out.println( error.getMessage() );

        }

    }

}

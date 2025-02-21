package content.exceptions.seventhclass.application;

import content.exceptions.seventhclass.model.entities.Account;

import content.exceptions.seventhclass.model.exceptions.InvalidBalanceException;

import content.exceptions.seventhclass.model.exceptions.InvalidLimitException;

import content.exceptions.seventhclass.model.exceptions.InvalidUserOption;

import java.util.Scanner;

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

            System.out.println( "Withdraw or Deposit (w/d)?" );

            char userChoice = init.next().charAt( 0 );

            depositOrWithdraw( userChoice, account, init );

        } catch ( InvalidBalanceException | InvalidLimitException error ) {

            System.out.println( error.getMessage() );

        }

    }

    private static void depositOrWithdraw ( char userChoice, Account account, Scanner init ) {

        try {

            System.out.println( "Enter amount: " );

            double amount = init.nextDouble();

            if ( userChoice == 'w' ) {

                double withdraw = account.withdraw( amount );

                System.out.println( withdraw );

            }

            if ( userChoice == 'd' ) {

                double deposit = account.deposit( amount );

                System.out.println( deposit );

            }

            throw new InvalidUserOption( "Enter a valid input!" );

        } catch ( InvalidUserOption error ) {

            System.out.println( error.getMessage() );

        }

    }

}

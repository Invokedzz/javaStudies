package heritage.randomstuff.app;

import heritage.randomstuff.entities.Account;

import heritage.randomstuff.entities.BusinessAccount;

import heritage.randomstuff.entities.SavingsAccount;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class Program {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperation ( init );

    }

    private static void mainOperation ( Scanner init ) {

        int numberOfAccounts = init.nextInt();

        for ( int i = 0; i < numberOfAccounts; i ++ ) {

            // holder (String), number (int), balance (double)

            System.out.println( "Enter the holder name: " );

            String holder = init.next();

            System.out.println( "Enter your account number: " );

            int number = init.nextInt();

            System.out.println( "Enter the initial balance: " );

            double balance = init.nextDouble();

            System.out.println( "Saving or Business Account? (b/s): " );

            char userChoice = init.next().charAt( 0 );

            optionsSelectedByUser( holder, number, balance, userChoice, init );

        }

    }

    private static void optionsSelectedByUser ( String holder, int number, double balance,
                                                char userChoice, Scanner init ) {

        List < Account > accountList = new ArrayList<>();

        if ( userChoice == 'b' ) {

            double loanLimit = init.nextDouble();

            accountList.add( new BusinessAccount( holder, number, balance, loanLimit ) );

        }

        if ( userChoice == 's' ) {

            double interestRate = init.nextDouble();

            accountList.add( new SavingsAccount( holder, number, balance, interestRate ) );

        }

    }

}

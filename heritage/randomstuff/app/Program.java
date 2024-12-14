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

            System.out.println( "Select the loan limit: " );

            double loanLimit = init.nextDouble();

            BusinessAccount businessAccount = new BusinessAccount( holder, number, balance, loanLimit );

            accountList.add( businessAccount );

            System.out.println( "Withdraw or deposit? (w/d): " );

            char getOrInsertValue = init.next().charAt( 0 );

            depositOrWithdraw ( businessAccount, getOrInsertValue, init );

        }

        if ( userChoice == 's' ) {

            System.out.println( "Select the interest rate: " );

            double interestRate = init.nextDouble();

            SavingsAccount savingsAccount = new SavingsAccount( holder, number, balance, interestRate );

            accountList.add( savingsAccount );

            System.out.println( "Withdraw or deposit? (w/d): " );

            char getOrInsertValue = init.next().charAt( 0 );

            depositOrWithdraw ( savingsAccount, getOrInsertValue, init );

        }

        for ( Account account : accountList) {

            System.out.println( account );

        }

    }

    private static void depositOrWithdraw ( Account account, char getOrInsertValue, Scanner init ) {

        if ( getOrInsertValue == 'w' ) {

            System.out.println( "Select the amount you want to withdraw: " );

            double withdrawValue = init.nextDouble();

            double getNewValue = account.withdraw( withdrawValue );

            System.out.println( getNewValue );

        }

        if ( getOrInsertValue == 'd' ) {

            System.out.println( "Select the amount you want to deposit: " );

            double depositValue = init.nextDouble();

            double getNewValue = account.deposit( depositValue );

            System.out.println( getNewValue );

        }

    }

}

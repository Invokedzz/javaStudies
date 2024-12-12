package heritage.app;

import heritage.entities.SavingsAccount;

import heritage.entities.BusinessAccount;

import heritage.entities.Account;

public class Program {

    public static void main ( String[] args ) {

        mainApplication();

    }

    private static void mainApplication () throws ClassCastException {

        Account account = new Account( "Mr.Duck", 1000.0, 100 );

        Account account1 = new BusinessAccount( "Mr.Goose", 1200.0, 99, 500 );

    //    BusinessAccount account2 = ( BusinessAccount ) new Account( "Mr.Frog", 1500.0, 67 );

        Account account2 = new SavingsAccount();

        System.out.printf( "%s\n%s", account, account1 );

        // Account -> BusinessAccount and SavingsAccount
        // but BusinessAccount and SavingsAccount can't Account 

    }

}

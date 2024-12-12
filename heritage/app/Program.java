package heritage.app;

import heritage.entities.SavingsAccount;

import heritage.entities.BusinessAccount;

import heritage.entities.Account;

public class Program {

    public static void main ( String[] args ) {

        mainApplication();

    }

    private static void mainApplication () throws ClassCastException {

        //    BusinessAccount account2 = ( BusinessAccount ) new Account( "Mr.Frog", 1500.0, 67 );

        // Account -> BusinessAccount and SavingsAccount
        // but BusinessAccount and SavingsAccount can't reach Account

        Account account = new Account( "Mr.Duck", 1220.0, 100 );

        BusinessAccount businessAccount = new BusinessAccount( "Mr.Goose", 3000.0,
                948, 1000 );

        SavingsAccount savingsAccount = new SavingsAccount( "Mr.Cookie Monster", 1200.0,
                100, 0.01 );

        double getWithdrawValue = account.withdraw( 1300 );

        double getWithdrawValueBusiness = businessAccount.withdraw( 1000.0 );

        double withdrawDuh = savingsAccount.withdraw( 1000 );

        System.out.printf( "Remaining value: %s\nRemaining value: %s\nRemaining value: %s"
                , getWithdrawValue, getWithdrawValueBusiness, withdrawDuh );

    }

}

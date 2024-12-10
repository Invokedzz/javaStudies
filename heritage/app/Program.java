package heritage.app;

import heritage.entities.BusinessAccount;

import heritage.entities.Account;

public class Program {

    public static void main ( String[] args ) {

        mainApplication();

    }

    private static void mainApplication () {

         Account accountBasis = new Account( "Mr. Duck", 1000.0, 10284 );

         BusinessAccount accountBusiness = new BusinessAccount( "Mr. Goose", 2000.0, 10293, 1000 );

         System.out.printf( "%s\n%s", accountBasis, accountBusiness );

    }

}

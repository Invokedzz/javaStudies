package content.heritage.randompackage.app;

import content.heritage.randompackage.entities.AccountStatus;

import content.heritage.randompackage.entities.BusinessAccount;

public class Program {

    public static void main ( String[] args ) {

        mainOperation();

    }

    private static void mainOperation () {

        BusinessAccount account = new BusinessAccount( "Mr.Duck", 1000.0, 1,
                AccountStatus.PREMIUM, 2000 );

        BusinessAccount otherAccount = new BusinessAccount( "Mr.Goose", 500.0, 2,
                AccountStatus.DEFAULT, 500 );

        double getLoan = account.loan( 2000, AccountStatus.PREMIUM );

        double getOtherLoan = otherAccount.loan( 400, AccountStatus.DEFAULT );

        System.out.printf("%s\n%s", getLoan, getOtherLoan);

    }

}

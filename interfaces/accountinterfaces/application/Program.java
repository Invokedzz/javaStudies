package interfaces.accountinterfaces.application;

import interfaces.accountinterfaces.entities.*;

import interfaces.accountinterfaces.services.*;

public class Program {

    public static void main ( String[] args ) {

        runProgram ();

    }

    private static void runProgram () {

        UserAccount userAccount = new UserAccount( "Mr.Goose", "1872AD3", 1000.0 );

        Payment payment = new Payment( userAccount, new ChineseTax() );

        double withdraw = payment.withdraw( 100.0 );

        System.out.println( withdraw );

        double deposit = payment.deposit( 200.0 );

        System.out.println( deposit );

    }

}

package content.LambdaJavaDoc.src.Example5th.src.application;

import content.LambdaJavaDoc.src.Example5th.src.model.services.*;

import content.LambdaJavaDoc.src.Example5th.src.model.entities.*;

public class Program {

    public static void main ( String[] args ) {

        runTheProgram();

    }

    private static void runTheProgram () {

        Account acc = new Account( "Mr.Duck", sortId("8374"), 1000.0 );

        ImplementsServices services = new ImplementsServices( acc );

        services.deposit(acc, 800.0);

        services.withdraw(acc, 100.0);

        displayAccount( acc );

    }

    private static String sortId ( String id ) {

        StringBuilder hashId;

        hashId = new StringBuilder();

        if ( id.matches("^[0-9]*$") ) {

            for ( int i = 0; i < id.length(); i++ ) {

                hashId.append(id.charAt(i)).append("#u2u4");

            }

        }

        return hashId.toString();

    }

    private static void displayAccount ( Account acc ) {

        DisplayAllAccount displayAllAccount = System.out::println;

        displayAllAccount.displayAccount( acc );

    }

}

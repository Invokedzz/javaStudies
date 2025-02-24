package content.exceptions.fourthclass;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

public class TheNiceWay {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperations ( init );

    }

    private static void mainOperations ( Scanner init ) {

        List < Employees > employeesList = new ArrayList<>();

        int numberOfEmployees = validateInput( init );

        for ( int index = 0; index < numberOfEmployees; index ++ ) {

            System.out.println( "Enter the employee name: " );

            String name = nameMatching( init );

            System.out.println( "Enter the employee id: " );

            String id = validateId( init );

            Employees employees = new Employees( name, id );

            employeesList.add( employees );

        }

        for ( Employees employees : employeesList ) {

            System.out.printf( "Employees: %s", employees.getName() );

            System.out.printf( " Id's: %s", employees.getId() );

        }

    }

    private static boolean hasInt ( Scanner init ) {

        return init.hasNextInt();

    }

    private static String nameMatching ( Scanner init ) {

        String name;

        while ( true ) {

            name = init.next().trim();

            if ( name.matches( "[a-zA-Z]+" ) ) return name;

            System.out.println( "Enter a valid name!" );

        }

    }

    private static String validateId ( Scanner init ) {

        String id;

        while ( true ) {

            id = init.next().trim();

            if ( id.matches( "\\d+" ) ) {

                if ( id.length() == 4 ) return id;

            }

            System.out.println( "Enter a valid id!" );

        }

    }

    private static int validateInput ( Scanner init ) {

        while ( !hasInt( init ) ) {

            System.out.println( "Enter a valid number!" );

            init.next();

        }

        return init.nextInt();

    }

}

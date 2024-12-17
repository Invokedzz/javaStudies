package exceptions.fourthclass;

import exceptions.fourthclass.Employees;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class MoreExceptionsWow {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperations ( init );

    }

    private static void mainOperations ( Scanner init ) {

        // You can create some functions in order to validate the "nextInt()" method;
        // or, you can use the try/catch in order to do that

        List < Employees > employeesList = new ArrayList<>();

            try {

                int numberOfEmployees = init.nextInt();

                for ( int index = 0; index < numberOfEmployees; index ++ ) {

                    System.out.println( "Enter the employee name: " );

                    String name = init.next();

                    System.out.println( "Enter the employee id: " );

                    String id = init.next();

                    Employees employees = new Employees( name, id );

                    employeesList.add( employees );

                }

            } catch ( InputMismatchException error ) {

                System.out.println( "Enter a valid number!" );

                init.next();

            }


        for ( Employees emp : employeesList ) {

            System.out.printf( "Names: %s", emp.getName() );

            System.out.printf( " Ids: %s ", emp.getId() );

        }

    }

}

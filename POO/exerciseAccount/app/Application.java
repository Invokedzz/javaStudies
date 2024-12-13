package POO.exerciseAccount.app;

import POO.exerciseAccount.entities.Employee;

import POO.exerciseAccount.entities.OutsourcedEmployee;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class Application {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperation( init );

    }

    private static void mainOperation ( Scanner init ) {

        List < Employee > employeeList = new ArrayList<>(); // name, hours, valuePerHour

    //    List < OutsourcedEmployee > outsourcedEmployeesList = new ArrayList<>();

        System.out.println( "Enter the number of employees: " );

        int employeesValue = init.nextInt();

        for ( int i = 0; i < employeesValue; i++ ) {

            System.out.println( "Outsourced?" );

            char outsourced = init.next().charAt(0);

            System.out.println( "Enter the name of the employee: " );

            String name = init.next();

            System.out.println( "Enter the number of hours they work: " );

            int hours = init.nextInt();

            System.out.println( "What's the value per hour? " );

            double valuePerHour = init.nextDouble();

            if ( outsourced == 'y') {

                System.out.println( "Additional charge: " );

                double additionalCharge = init.nextDouble();

                employeeList.add(new OutsourcedEmployee( name, hours, valuePerHour, additionalCharge ));

            }

            employeeList.add(new Employee( name, hours, valuePerHour ));

        }

        for ( Employee emp : employeeList) {

            System.out.println( emp );

        }

    }

}

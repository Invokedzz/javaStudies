package interfaces.comparables.application;

import interfaces.comparables.entities.Employees;

import java.io.IOException;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import java.io.File;

import java.io.BufferedReader;

import java.io.FileReader;

public class Program {

    public static void main ( String[] args ) {

        runTheProgram ();

    }

    private static void runTheProgram () {

        List < Employees > employeesList = new ArrayList<>();

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/interfaces/comparables/out/employees" );

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( file ) ) ) {

            String employee = bufferedReader.readLine();

            while ( employee != null ) {

                String[] fields = employee.split("," );

                employeesList.add( new Employees( fields[0], Double.parseDouble( fields[1] ) ) );

                employee = bufferedReader.readLine();

            }

            Collections.sort( employeesList );

            for ( Employees employees : employeesList ) {

                System.out.println( employees );

            }

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

}

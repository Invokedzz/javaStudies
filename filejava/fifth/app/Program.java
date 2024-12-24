package filejava.fifth.app;

import filejava.fifth.model.entities.Worker;

import java.io.IOException;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.BufferedWriter;

import java.io.FileWriter;

import java.util.Scanner;

public class Program {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        programStart ( init );

    }

    private static void programStart ( Scanner init ) {

        String path = "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/fifth/model/entities/workerfile";

        try ( BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter ( path, true ) ) ) {

            int numberOfWorkers = validateInt( init );

            for ( int index = 0; index < numberOfWorkers; index ++ ) {

                String name = init.next();

                Integer id = validateInt( init );

                String department = init.next();

                Worker worker = new Worker( name, id, department );

                bufferedWriter.write( worker.toString() );

            }

            bufferedWriter.close();

            try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( path ) ) ) {

                String line = bufferedReader.readLine();

                while ( line != null ) {

                    System.out.println( line );

                    line = bufferedReader.readLine();

                }

            }

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

    private static boolean hasNextInt ( Scanner init ) {

        return init.hasNextInt();

    }

    private static int validateInt ( Scanner init ) {

        while ( !hasNextInt( init ) ) {

            System.out.println( "Enter a valid value!" );

            init.next();

        }

        return init.nextInt();

    }

}

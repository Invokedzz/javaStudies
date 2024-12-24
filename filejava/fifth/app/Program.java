package filejava.fifth.app;

import filejava.fifth.model.entities.Worker;

import java.util.List;

import java.util.ArrayList;

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

        List < Worker > workerList = new ArrayList<>();

        try ( BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter ( path, true ) ) ) {

            int numberOfWorkers = validateInt( init );

            for ( int index = 0; index < numberOfWorkers; index ++ ) {

                System.out.println( "Enter a name: " );

                String name = init.next();

                System.out.println( "Enter an id: " );

                int id = validateInt( init );

                System.out.println( "Enter a department: " );

                String department = init.next();

                while ( verifyWorkers( workerList, name ) ) {

                    System.out.println( "This name already exists! Try again." );

                    name = init.next();

                }

                while ( verifyWorkersId( workerList, id ) ) {

                    System.out.println( "This id already exists! Try again." );

                    id = validateInt( init );

                }

                Worker worker = new Worker( name, id, department );

                workerList.add( worker );

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

    private static boolean verifyWorkers ( List < Worker > workerList, String worker ) {

       Worker findWorker = workerList.stream().filter( x -> x.getWorker().equals( worker ) ).findFirst().orElse( null );

       return findWorker != null;

    }

    private static boolean verifyWorkersId ( List < Worker > workerList, Integer id ) {

        Worker findId = workerList.stream().filter( x -> x.getId().equals( id ) ).findFirst().orElse( null );

        return findId != null;

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

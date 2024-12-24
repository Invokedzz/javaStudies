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

            int numberOfWorkers = init.nextInt();

            for ( int index = 0; index < numberOfWorkers; index ++ ) {

                String name = init.next();

                Integer id = init.nextInt();

                String department = init.next();

                Worker worker = new Worker( name, id, department );

                bufferedWriter.write( worker.toString() );

            }

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

}

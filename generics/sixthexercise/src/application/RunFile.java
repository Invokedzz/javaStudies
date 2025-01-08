package generics.sixthexercise.src.application;

import generics.sixthexercise.src.model.services.VerifyHigherNumber;

import generics.sixthexercise.src.model.services.VerifyHigherNumberComplete;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.io.File;

import java.util.ArrayList;

import java.util.List;

public class RunFile {

    public static void analyzeWholeFile () {

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/generics/sixthexercise/src/model/files/randomstuffver" );

        List < String > list = new ArrayList<>();

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( file ))) {

            String readStuff = bufferedReader.readLine();

            while ( readStuff != null ) {

                list.add( readStuff );

                readStuff = bufferedReader.readLine();

            }

            System.out.println( VerifyHigherNumber.compareNumbers( list ) );

            System.out.println( VerifyHigherNumberComplete.compareValues( list ) );

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

}

package generics.fifthexercise.src.application;

import generics.fifthexercise.src.model.services.CalculationService;

import generics.fifthexercise.src.model.entities.Product;

import java.util.ArrayList;

import java.util.List;

import java.io.*;

public class Operations {

    public static void runApp () {

        List < Product > productList = new ArrayList<>();

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/generics/fifthexercise/src/model/files/filetext" );

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( file ))) {

            String readLine = bufferedReader.readLine();

            while ( readLine != null ) {

                String [] fields = readLine.split( "," );

                productList.add( new Product( fields[0], Double.parseDouble( fields[1] ) ));

                readLine = bufferedReader.readLine();

            }

            Product productCalculation = CalculationService.max( productList );

            System.out.println( productCalculation );

        } catch ( IOException error ) {

           System.out.printf( "Error: %s", error.getMessage() );

        }

    }

}

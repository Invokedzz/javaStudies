package filejava.secondexercise.application;

import java.io.*;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

import filejava.secondexercise.model.entities.Product;

public class Application {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner ( System.in );

        letsRunThisProgram ( sc );

    }

    private static void letsRunThisProgram ( Scanner sc ) {

        List < Product > productList = new ArrayList<>();

        File filePath = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/secondexercise/model/input.csv" );

        String getFolderPath = filePath.getParent();

        File prepareANewPath = new File( getFolderPath + "/out" );

        boolean wasFolderCreated = prepareANewPath.mkdir();

        getMessageForFileCreation( wasFolderCreated );

        try ( BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter ( prepareANewPath + "/cool", true ) ) ) {

            System.out.println( "Enter the number of products: " );

            int numberOfProducts = sc.nextInt();

            for ( int index = 0; index < numberOfProducts; index ++ ) {

                System.out.println( "Enter the product name: " );

                String productName = sc.next();

                System.out.println( "Enter the product price: " );

                Double productPrice = sc.nextDouble();

                System.out.println( "Enter the product quantity: " );

                Integer productQuantity = sc.nextInt();

                Product product = new Product( productName, productPrice, productQuantity );

                bufferedWriter.write( product.toString() );

                productList.add( product );

            }

            bufferedWriter.close();

            for ( Product products : productList ) {

                System.out.printf( "Product: %s", products );

            }

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }

    }

    private static void getMessageForFileCreation ( boolean wasFolderCreated ) {

        if ( !wasFolderCreated ) {

            System.out.println( "Was created!" );

            return;

        }

        System.out.printf( "Created: %s", true );

    }

}

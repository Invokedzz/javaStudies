package content.POO.onemoreexercise.app;

import content.POO.onemoreexercise.entities.ImportedProduct;

import content.POO.onemoreexercise.entities.UsedProduct;

import content.POO.onemoreexercise.entities.Product;

import java.time.format.DateTimeFormatter;

import java.util.Scanner;

import java.util.List;

import java.util.ArrayList;

import java.time.LocalDate;

public class Program {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperation ( init );

    }

    private static void mainOperation ( Scanner init ) {

        List < Product > productList = new ArrayList<>();

        System.out.println( "Enter the number of products: " );

        int numberOfProducts = init.nextInt();

        for ( int i = 0; i < numberOfProducts; i++ ) {

            System.out.printf("Product #%s data: ", i + 1 );

            System.out.println( "Common, used or imported (c/u/i)?" );

            char decision = init.next().charAt(0);

            System.out.println( "Name: " );

            String name = init.next();

            System.out.println( "Price: " );

            double price = init.nextDouble();

            if ( decision == 'c') productList.add( new Product( name, price ) );

            if ( decision == 'i' ) {

                double customFee = init.nextDouble();

                productList.add( new ImportedProduct( name, price, customFee ) );

            }

            if ( decision == 'u' ) {

                LocalDate manufactureDate = LocalDate.parse(init.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                productList.add( new UsedProduct( name, price, manufactureDate ) );

            }

        }

        System.out.println("Products: ");

        for ( Product product : productList ) {

            System.out.println(product.priceTag());

        }

    }

}

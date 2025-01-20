package LambdaJavaDoc.src.Example6th.src.application;

import LambdaJavaDoc.src.Example6th.src.entities.Product;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        runProgram();

    }

    private static void runProgram () {

        List < Product > products = new ArrayList<>();

        products.add(new Product("Tv", 900.00));

        products.add(new Product("Mouse", 50.00));

        products.add(new Product("Tablet", 350.50));

        products.add(new Product("HD Case", 80.90));

        products.removeIf( p -> p.getPrice() <= 100 );

        for ( Product items : products ) {

            System.out.println( items );

        }

    }

}

package LambdaJavaDoc.src.Example6th.src.application;

import LambdaJavaDoc.src.Example6th.src.entities.Product;

import LambdaJavaDoc.src.Example6th.src.util.ProductPredicate;

import java.util.ArrayList;

import java.util.List;

public class Program2 {

    public static void main ( String[] args ) {

        runThisProgramAgain();

    }

    private static void runThisProgramAgain () {

        List < Product > productList = new ArrayList<>();

        productList.add(new Product("Tv", 900.00));

        productList.add(new Product("Mouse", 50.00));

        productList.add(new Product("Tablet", 350.50));

        productList.add(new Product("HD Case", 80.90));

        ProductPredicate productPredicate = ( product ) -> product.getPrice() >= 100.0; // lambda inline method; way cooler ngl

        productList.removeIf( productPredicate );

        for ( Product items : productList ) {

            System.out.println( items );

        }

    }

}

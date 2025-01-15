package lambdaandmore.firstencounter.src.application;

import lambdaandmore.firstencounter.src.entities.Product1;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class Program1 {

    public static void main ( String[] args ) {

        Product1 firstProduct = new Product1( "Bert", 123.0 );

        Product1 secondProduct = new Product1( "Albert", 100.0 );

        List< Product1 > product1List = new ArrayList<>();

        product1List.add( firstProduct );

        product1List.add( secondProduct );

        Collections.sort( product1List ); // I can't forget about this method for real ;-;

        for ( Product1 item : product1List ) {

            System.out.println(item);

        }

    }

}

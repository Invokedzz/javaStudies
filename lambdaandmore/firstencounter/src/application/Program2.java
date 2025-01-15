package lambdaandmore.firstencounter.src.application;

import lambdaandmore.firstencounter.src.entities2.ComparatorForProduct2;
import lambdaandmore.firstencounter.src.entities2.Product2;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main ( String[] args ) {

        testingComparator();

    }

    private static void testingComparator () {

        List < Product2 > listForProducts = new ArrayList<>();

        listForProducts.add( new Product2( "Dog", 100.0 ));

        listForProducts.add( new Product2( "Cat", 85.5 ));

        listForProducts.sort( new ComparatorForProduct2() );

        for ( Product2 item : listForProducts ) {

            System.out.println( item );

        }

    }

}

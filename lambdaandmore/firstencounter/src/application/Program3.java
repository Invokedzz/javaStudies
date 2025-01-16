package lambdaandmore.firstencounter.src.application;

import lambdaandmore.firstencounter.src.entities3.Product3;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class Program3 {

    public static void main ( String[] args ) {

        runTheProgram();

    }

    private static void runTheProgram () {

        List < Product3 > product3List = new ArrayList<>();

        product3List.add( new Product3("Product1", 1000.0 ));

        product3List.add( new Product3("ProductN2", 2000.0 ));

        product3List.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

        for ( Product3 items : product3List ) {

            System.out.println( items );

        }

    }

}

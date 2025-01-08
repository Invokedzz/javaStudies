package generics.wildcard.firstencounter.src;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        operations();

    }

    private static void operations () {

        List < Integer > integerList = new ArrayList<>();

        integerList.add( 1 );

        integerList.add( 2 );

        getWildCard ( integerList );

    }

    private static void getWildCard ( List < ? > list ) { // this here: "List <?>" is a wildcard

        for ( Object item : list ) {

            System.out.println( item );

        }

    }

}

package generics.wildcard.fifthencounter.src.application;

import java.util.Arrays;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        runThisBs ();

    }

    private static void runThisBs () {

        List < Integer > integerList = Arrays.asList( 1, 2, 3, 4 );

        List < Object > objectList = new ArrayList<>();

        copyElements( objectList, integerList );

        printList ( objectList );

    }

    private static void copyElements ( List < ? super Number > list, List < ? extends Number > otherList ) {

        for ( Number element : otherList ) {

            list.add( element );

        }

    }

    private static void printList ( List < ? > list ) {

        for ( Object item : list ) {

            System.out.println( item );

        }

    }

}

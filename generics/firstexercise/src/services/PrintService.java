package generics.firstexercise.src.services;

import java.util.ArrayList;

import java.util.List;

public class PrintService {

    List < Integer > numberList = new ArrayList<>();

    public void addValue ( int value ) {

        numberList.add( value );

    }

    public void showFirstElement () {

        if ( !numberList.isEmpty() ) System.out.printf( "First element of the list: %s\n", numberList.getFirst() );

    }

    public void printList () {

        System.out.println( numberList );

        for ( Integer elements : numberList ) {

            System.out.println( elements );

        }

    }

}

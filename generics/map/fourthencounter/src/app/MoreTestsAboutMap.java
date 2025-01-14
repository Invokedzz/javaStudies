package generics.map.fourthencounter.src.app;

import java.util.Map;

import java.util.LinkedHashMap;

import java.util.HashMap;

public class MoreTestsAboutMap {

    public static void main ( String[] args ) {

        test();

        System.out.println( "/////////////////////////" );

        getElement();

    }

    private static void test () {

        Map < String, Double > elements = new HashMap<>();

        elements.put( "Elements", 1500.0 );

        receiveElement( elements );

    }

    private static void receiveElement ( Map < ?, ? > elements ) {

        // receives any type of element, that's why Map < ?, ? > elements

        for ( Object key : elements.keySet() ) {

            System.out.println( elements.get( key ) );

            System.out.println( key );

        }

    }

    private static void getElement () {

        String elementString = "Paolo";

        Integer elementInteger = 10;

        Map < String, Integer > moreElements = new HashMap<>();

        moreElements.put( elementString, elementInteger );

        if ( moreElements.containsKey(elementString)) System.out.println("Deftones rocks!");

    }

}

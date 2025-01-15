package generics.map.sixthencounter.src;

import java.util.Map;
import java.util.TreeMap;

import java.util.NavigableMap;

public class Program {

    public static void main ( String[] args ) {

        runTheTests();

    }

    private static void runTheTests () {

        // Map < Key, Value > map = new HashMap() -> example
        //     getKey, getValue

        NavigableMap < String, Integer > navigableMap = new TreeMap<>();

        navigableMap.put( "Value 1", 1 );

        navigableMap.put( "Value 2", 2 );

        navigableMap.put( "Value 3", 3 );

        navigableMap.put( "Value 4", 4 );

        navigableMap.put( "Value 5", 5 );

        for ( Map.Entry < String, Integer > entry : navigableMap.entrySet() ) {

            System.out.println( entry.getValue() + " " + entry.getKey() );

        }

        System.out.println( "/////////////////////////////" );

        for ( Map.Entry < String, Integer > entry : navigableMap.descendingMap().entrySet() ) {

            System.out.println( entry.getValue() + " " + entry.getKey() );

        }

    }

}

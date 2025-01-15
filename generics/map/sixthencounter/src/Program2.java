package generics.map.sixthencounter.src;

import java.util.NavigableMap;

import java.util.TreeMap;

public class Program2 {

    public static void main ( String[] args ) {

        moreTests();

    }

    private static void moreTests () {

        NavigableMap < String, String > map = new TreeMap<>();

        map.put( "1", "Value1" );

        map.put( "10", "Value10" );

        map.put( "100", "Value100" );

        map.put( "1000", "Value1000" );

        map.put( "10000", "Value10000" );

        System.out.println( map.ceilingEntry("100"));

        System.out.println( map.headMap("1000", true ));  // gets all the keys above the selected key

    }

}

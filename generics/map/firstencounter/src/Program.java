package generics.map.firstencounter.src;

import java.util.Map;

import java.util.HashMap;

public class Program {

    public static void main ( String[] args ) {

        // testMap();

    }

    private static void testMap () {

        Map < String, String > info = new HashMap<>();

        info.put( "Name: ", "Jean" );

        info.put( "Nickname: ", "Paul" );

        for ( String values : info.keySet() ) {

            System.out.println( info.get( values ));

        }

        for ( String key : info.keySet() ) {

            System.out.println( key );

        }

    }

}

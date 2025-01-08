package generics.wildcard.firstencounter.src;

// time to explore wildcards a bit more

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ProgramTwo {

    public static void main ( String[] args ) {

       /* List < ? > list = new ArrayList<>();

        list.add( 1 ); Wildcards don't accept if I try to add new elements to them, so instead... */

        List < String > stringList = Arrays.asList( "Paul", "Mart", "Mario" );

        // stringList.add( "Jeremiah" ); // this results in an exception

        // so you can do it like that:

        List < String > list = new ArrayList<>();

        list.add( "Kaz" );

        list.add( "Lucina" );

        addingElementsInWildCards( list );

        // and now you don't have an exception :)

    }

    private static void addingElementsInWildCards ( List < ? > list ) {

        for ( Object item : list ) {

            System.out.println( item );

        }

    }

}

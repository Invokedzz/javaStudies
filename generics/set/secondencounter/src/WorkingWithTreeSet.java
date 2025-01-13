package generics.set.secondencounter.src;

import java.util.Arrays;

import java.util.TreeSet;

import java.util.Set;

public class WorkingWithTreeSet {

    public static void main ( String[] args ) {

        treeSetCore();

    }

    private static void treeSetCore () {

        Set < Integer > a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));

        Set < Integer > b = new TreeSet<>(Arrays.asList(5,5,6,7,8,9,10));

        Set < Integer > c = new TreeSet<>( a );

        c.addAll( b ); // add all the elements inside the array b

        c.retainAll( b ); // filters only the b elements

        c.removeAll( b ); // removes all of them

        System.out.println( c ); // returns []

    }

}

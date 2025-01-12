package generics.set.firstencounter.src;

import java.util.Set;

import java.util.HashSet;

import java.util.Scanner;

import generics.set.firstencounter.entities.Product;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        runThisShit( sc );

    }

    private static void runThisShit ( Scanner sc ) {

        /*This class implements the Set interface, backed by a hash table (actually a HashMap instance).
                It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.
                This class permits the null element.
                This class offers constant time performance for the basic operations (add, remove, contains and size),
                 assuming the hash function disperses the elements properly among the buckets.
                  Iterating over this set requires time proportional to the sum of the HashSet instance's size (the number of elements)
                   plus the "capacity" of the backing HashMap instance (the number of buckets).
                   Thus, it's very important not to set the initial capacity too high (or the load factor too low) if iteration performance is important.
         */

        Set < Product > stringSet = new HashSet<>(); // faster (o1), it doesn't have an ordered list

        int numberOfElements = sc.nextInt();

        for ( int index = 0; index < numberOfElements; index ++ ) {

            String productName = sc.next();

            String productId = sc.next();

            stringSet.add( new Product( productName, productId ));

        }

        for ( Product item : stringSet ) {

            System.out.println( item );

        }

        /* Output (HashSet list):

        3
        paper
        10293
        ball
        1000
        rock
        12342
        Name: rock, product id: 12342
        Name: paper, product id: 10293
        Name: ball, product id: 1000
        
        */

    }

}

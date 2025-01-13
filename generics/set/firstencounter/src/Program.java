package generics.set.firstencounter.src;

import java.util.*;

import generics.set.firstencounter.entities.Product;

import generics.set.firstencounter.entities.Game;

import generics.set.firstencounter.entities.Employee;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        // runThisShit( sc );

        // testTreeSet( sc );

        linkedHashSet( sc );

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

    private static void testTreeSet ( Scanner sc ) {

        Set < Employee > employeeSet = new TreeSet<>(); // now that we implemented "Comparable <Employee>", TreeSet is doing fine

        int numberOfElements = sc.nextInt();

        for ( int index = 0; index < numberOfElements; index ++ ) {

            String employeeName = sc.next();

            Integer employeeId = sc.nextInt();

            employeeSet.add( new Employee( employeeName, employeeId ));

        }

        for ( Employee item : employeeSet ) {

            System.out.println( item );

        }

        Employee firstEmployee = new Employee( "John", 18273 );

        Employee secondEmployee = new Employee( "Robert", 7283 );

        int comparingElements = firstEmployee.compareTo( secondEmployee );

        System.out.println( comparingElements );

    }

    private static void linkedHashSet ( Scanner sc ) { // normal execution, and a list ordered by the elements added

        Set < Game > gameSet = new LinkedHashSet<>();

        gameSet.add( new Game("Super Mario World", 60.0 ));

        gameSet.add( new Game("Sonic The Hedgehog", 50.0 ));

        for ( Game item : gameSet ) {

            System.out.println( item );

        }

    }

}

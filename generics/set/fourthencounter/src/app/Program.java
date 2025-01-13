package generics.set.fourthencounter.src.app;

import generics.set.fourthencounter.src.entities.Worker;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main ( String[] args ) {

        testingSet();

    }

    private static void testingSet () {

        Set < Worker > workerSet = new HashSet<>();

        Worker worker = new Worker( "Mr.Duck", "2635" );

        Worker worker2 = new Worker( "Mr.Duck", "2635" );

        workerSet.add( worker );

        workerSet.add( worker2 );

        System.out.println( workerSet );

    }

}

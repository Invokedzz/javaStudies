package generics.set.fifthencounter.src.app;

import java.util.HashSet;

import java.util.Scanner;

import java.util.Set;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        programMainOperations( sc );

    }

    private static void programMainOperations ( Scanner sc ) {

        Set < Integer > classA = new HashSet<>();

        Set < Integer > classB = new HashSet<>();

        Set < Integer > classC = new HashSet<>();

        int classAStudentsNumber = sc.nextInt();

        for ( int index = 0; index < classAStudentsNumber; index ++ ) {

            int idsFromClassA = sc.nextInt();

            classA.add( idsFromClassA );

        }

        int classBStudentsNumber = sc.nextInt();

        for ( int index = 0; index < classBStudentsNumber; index ++ ) {

            int idsFromClassB = sc.nextInt();

            classB.add( idsFromClassB );

        }

        int classCStudentsNumber = sc.nextInt();

        for ( int index = 0; index < classCStudentsNumber; index ++ ) {

            int idsFromClassC = sc.nextInt();

            classC.add( idsFromClassC );

        }

        Set < Integer > getAllStudents = new HashSet<>( classA );

        getAllStudents.addAll( classB );

        getAllStudents.addAll( classC );

        System.out.println( getAllStudents.size() );

    }

}

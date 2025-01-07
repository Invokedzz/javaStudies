package generics.thirdexercise.src.application;

import generics.thirdexercise.src.services.ListServiceStuff;

import java.util.Scanner;

public class Run {

    public static void runApp ( Scanner sc ) {

        int howManyElements = sc.nextInt();

        ListServiceStuff < String > listServiceStuff = new ListServiceStuff<>();

        for ( int index = 0; index < howManyElements; index ++ ) {

            System.out.println( "Enter a word (any word): " );

            String randomWord = sc.next();

            listServiceStuff.addElementToList( randomWord );

        }

        listServiceStuff.printWholeList();

    }

}

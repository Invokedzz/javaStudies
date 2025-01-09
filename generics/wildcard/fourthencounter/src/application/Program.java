package generics.wildcard.fourthencounter.src.application;

import generics.wildcard.fourthencounter.src.entities.Character;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        runThisShit ();

    }

    private static void runThisShit () {

        Character character = new Character( "Paul", 100 );

        List < Character > characters = new ArrayList<>();

        characters.add( character );

        printList( characters );

    }

    private static void printList ( List < ? extends Character > list ) {

        for ( Character character : list ) {

            System.out.println( character );

        }

    }

    /*
    private static void printList ( List < ? > list ) {

        for ( Character character : list ) {

            System.out.println( character );

        }

    }  this results in an error! */

}

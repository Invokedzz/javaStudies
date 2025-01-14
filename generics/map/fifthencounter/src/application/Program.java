package generics.map.fifthencounter.src.application;

import generics.map.fifthencounter.src.model.entities.Client;

import generics.map.fifthencounter.src.model.entities.Novel;

public class Program {

    public static void main ( String[] args ) {

        executeProgram();

    }

    private static void executeProgram () {

        Novel novel = new Novel( "Berserk", 1L,10.00 );

        Client client = new Client( "Paul Walker", 1L, 100.0 );

        System.out.println( novel );

        System.out.println( client );

    }

}

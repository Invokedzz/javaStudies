package generics.map.fifthencounter.src.application;

import generics.map.fifthencounter.src.model.entities.Client;

import generics.map.fifthencounter.src.model.entities.Novel;

import generics.map.fifthencounter.src.model.services.NovelServices;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        executeProgram();

    }

    private static void executeProgram () {

        Novel novel = new Novel( "Berserk", 1L,10.00 );

        Novel novel2 = new Novel( "Vagabond", 1L, 15.00 );

        Client client = new Client( "Paul Walker", 1L, 100.0 );

        List < Novel > novelList = new ArrayList<>();

        novelList.add( novel );

        novelList.add( novel2 );

        NovelServices novelServices = new NovelServices( client, novelList );

        double result = novelServices.receivePaymentCredits();

        System.out.println( result );

    }

}

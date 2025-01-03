package interfaces.whaaa.app;

import interfaces.whaaa.entities.Citizen;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import java.util.Scanner;

public class Application {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        runTheProgram ( sc );

    }

    private static void runTheProgram ( Scanner sc ) {

        List < Citizen > citizenList = new ArrayList<>();

        System.out.println( "Enter the number of citizens you want to analyze: " );

        int numberOfCitizens = sc.nextInt();

        for ( int index = 0; index < numberOfCitizens; index ++ ) {

            System.out.println( "Enter your name: " );

            String name = sc.next();

            System.out.println( "Enter your last name: " );

            String lastName = sc.next();

            System.out.println( "Enter your cash: ");

            double cash = sc.nextDouble();

            Citizen citizen = new Citizen( name, lastName, cash );

            citizenList.add( citizen );

        }

        Collections.sort( citizenList );

        for ( Citizen citizen : citizenList ) {

            System.out.println( citizen );

        }

    }

}

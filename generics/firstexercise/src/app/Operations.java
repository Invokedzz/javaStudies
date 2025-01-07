package generics.firstexercise.src.app;

import java.util.Scanner;

import generics.firstexercise.src.services.PrintService;

public class Operations {

    public static void initOperations ( Scanner sc ) {

        PrintService printService = new PrintService();

        System.out.println( "Enter the number of items you want in this list: " );

        int numberOfIterations = sc.nextInt();

        for ( int index = 0; index < numberOfIterations; index ++ ) {

            System.out.println( "Enter an element: " );

            int element = sc.nextInt();

            printService.addValue( element );

        }

        printService.showFirstElement();

        printService.printList();

    }

}

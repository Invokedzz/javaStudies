package generics.secondexercise.src.application;

import generics.secondexercise.src.model.entities.*;

import generics.secondexercise.src.model.services.*;

import java.util.Scanner;

public class OperationsWithList {

    public static void mainOperations ( Scanner sc ) {

        int numberOfElements = sc.nextInt();

        ListServices listServices = new ListServices();

        for ( int index = 0; index < numberOfElements; index ++ ) {

            // ListElements -> taskId: Integer, task: String, taskConcluded: Boolean

            Integer taskId = index;

            System.out.println( "Enter the name of the task: " );

            String task = sc.next();

            System.out.println( "This task was concluded? (true/false)" );

            Boolean taskConcluded = sc.nextBoolean();

            ListElements listElements = new ListElements( taskId, task, taskConcluded );

            listServices.addElementsToTheList( listElements );

            listServices.printList();

        }

        listServices.concludeTask( sc, 0 );

    }

}

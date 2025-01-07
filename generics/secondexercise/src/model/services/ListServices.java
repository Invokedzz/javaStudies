package generics.secondexercise.src.model.services;

import generics.secondexercise.src.model.entities.ListElements;

import generics.secondexercise.src.model.exceptions.EmptyListException;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class ListServices {

    List < ListElements > elementsList = new ArrayList<>();

    public void addElementsToTheList ( ListElements elements ) {

        elementsList.add( elements );

    }

    public void removeElementsFromTheList ( int index ) {

        elementsList.remove( index );

    }

    public void concludeTask ( Scanner sc, int index ) {

        ListElements elements = elementsList.get( index );

        char askUser = sc.next().charAt( 0 );

        System.out.println( "Would you like to complete this task?" );

        if ( askUser == 'y' || askUser == 'Y' ) {

            if ( elements.getIsTaskConcluded().equals( false ) ) {

                elements.setIsTaskConcluded( true );

            }

        }

    }

    public void printList () {

        if ( !elementsList.isEmpty() ) {

            for ( ListElements elements : elementsList ) {

                System.out.println( elements );

            }

        }

        throw new EmptyListException( "The current list doesn't have any elements inside in it!" );

    }

}

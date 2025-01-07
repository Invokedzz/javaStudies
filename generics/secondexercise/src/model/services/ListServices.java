package generics.secondexercise.src.model.services;

import generics.secondexercise.src.model.entities.ListElements;

import generics.secondexercise.src.model.exceptions.EmptyListException;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class ListServices {

    List < ListElements > elementsList = new ArrayList<>();

    public List < ListElements > getElementsList () {

        return elementsList;

    }

    public void addElementsToTheList ( ListElements elements ) {

        elementsList.add( elements );

    }

    public void removeElementsFromTheList ( int index ) {

        elementsList.remove( index );

    }

    public void concludeTask ( Scanner sc, int index ) {

        for ( ListElements element : elementsList ) {

            if ( element.getIsTaskConcluded().equals( true ) ) {

                System.out.println( "Skip this one" );

                break;

            }

            ListElements elements = elementsList.get( index );

            if ( elements.getIsTaskConcluded().equals( true ) ) break;

            System.out.println( "Would you like to complete this task?" );

            char askUser = sc.next().charAt( 0 );

            if ( askUser == 'y' || askUser == 'Y' ) {

                if ( elements.getIsTaskConcluded().equals( false ) ) {

                    elements.setIsTaskConcluded( true );

                    System.out.println( elements );

                    return;

                }

            }

            System.out.println( "This task was already completed!" );

        }

    }

    public void printList () {

        if (!elementsList.isEmpty()) {

            for (ListElements elements : elementsList) {

                System.out.println(elements);

            }

            return;

        }

        throw new EmptyListException("The current list doesn't have any elements inside in it!");

    }

}

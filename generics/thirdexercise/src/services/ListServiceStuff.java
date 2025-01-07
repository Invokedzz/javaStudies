package generics.thirdexercise.src.services;

import generics.secondexercise.src.model.exceptions.EmptyListException;

import java.util.ArrayList;

import java.util.List;

public class ListServiceStuff <T> {

    private final List <T> list = new ArrayList<>();

    public List <T> getList () {

        return list;

    }

    public void addElementToList ( T element ) {

        list.add( element );

    }

    public void removeElementFromList ( T element ) {

        list.remove( element );

    }

    private T printFirstElement () {

        if ( list.isEmpty() ) throw new EmptyListException( "The list is empty. There's no element to print!" );

        return list.getFirst();

    }

    public void printWholeList () {

        if ( !list.isEmpty() ) {

            for ( T element : list ) {

                System.out.println( element );

            }

            System.out.println( printFirstElement() );

        }

    }

}

package generics.fifthexercise.src.model.services;

import generics.secondexercise.src.model.exceptions.EmptyListException;

import java.util.List;

public class CalculationService {

    public static < T extends  Comparable <T>> T max ( List<T> list ) {

        T max = list.getFirst();

        if (list.isEmpty()) throw new EmptyListException( "The list can't be empty!" );

        for ( T item : list ) {

            if ( item.compareTo( max ) > 0 ) max = item;

        }

        return max;

    }

}

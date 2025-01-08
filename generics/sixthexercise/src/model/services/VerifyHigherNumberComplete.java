package generics.sixthexercise.src.model.services;

import generics.secondexercise.src.model.exceptions.EmptyListException;

import java.util.List;

public class VerifyHigherNumberComplete {

    public static < T extends Comparable < ? super T > > T compareValues ( List < T > list ) {

        if ( list.isEmpty() ) throw new EmptyListException( "This list can't be empty, user!" );

        T maxValue = list.getFirst();

        for ( T elementFromList : list ) {

            if ( elementFromList.compareTo( maxValue ) > 0 ) maxValue = elementFromList;

        }

        return maxValue;

    }

}

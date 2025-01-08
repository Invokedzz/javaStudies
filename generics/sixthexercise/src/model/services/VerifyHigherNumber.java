package generics.sixthexercise.src.model.services;

import java.util.List;

public class VerifyHigherNumber {

    public static < T extends Comparable <T> > T compareNumbers ( List<T> list ) {

        T max = list.getFirst();

        for ( T item : list ) {

            if ( item.compareTo( max ) >= 0 ) max = item;

        }

        return max;

    }

}

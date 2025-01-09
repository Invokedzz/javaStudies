package Challenge.firstChallenge.src.application;

import java.util.Arrays;

public class Program {

    public static void main ( String[] args ) {

        int [] numbers = new int[]{10, 20, 31, 21, 2};

        int result = warOfNumbers( numbers );

        System.out.println( result );

    }

    public static int warOfNumbers( int[]numbers ) {

        int sumEvenNumbers = 0;

        int sumOddNumbers = 0;

        for ( int index = 0; index < numbers.length; index ++ ) {

            if ( numbers [index] % 2 == 0 ) sumEvenNumbers += numbers [index];

            else sumOddNumbers += numbers [index];

        }

        return sumEvenNumbers - sumOddNumbers;

    }

}

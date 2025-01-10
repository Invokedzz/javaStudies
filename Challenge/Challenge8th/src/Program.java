package Challenge.Challenge8th.src;

import java.util.Arrays;

public class Program {

    public static void main ( String[] args ) {

        int[] getArrayOfMultiples = arrayOfMultiples( 10, 10 );

        System.out.println( Arrays.toString( getArrayOfMultiples ) );

    }

    private static int [] arrayOfMultiples ( int num, int length ) {

        int [] multiple = new int [ length ];

        for ( int index = 0; index < multiple.length; index ++ ) {

            multiple [ index ] = ( index + 1 ) * num;

        }

        return multiple;

    }

}

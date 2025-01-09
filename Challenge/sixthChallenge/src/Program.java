package Challenge.sixthChallenge.src;

public class Program {

    public static void main ( String[] args ) {

        int [] integerValues = new int[]{1, 2, 3, 4, 10};

        boolean isTrue = existsHigher( integerValues, 10 );

        System.out.println( isTrue );

    }

    public static boolean existsHigher(int[] arr, int n) {

        for ( int item : arr ) {

            if ( item >= n ) return true;

        }

        return false;

    }

}

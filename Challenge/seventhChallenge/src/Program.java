package Challenge.seventhChallenge.src;

public class Program {

    public static void main ( String[] args ) {

        int values = equal( 1, 1, 0 );

        System.out.println( values );

    }


    public static int equal(int a, int b, int c) {

        if (a == b || a == c || b == c) {

            if (a == c && a == b) return 3;

            return 2;

        }

        return 0;

    }

}

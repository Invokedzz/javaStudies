package Challenge.fifthChallenge.src;

public class Program {

    public static void main ( String[] args ) {

        boolean [] booleans = new boolean[]{true, true, true, false};

        int values = countTrue( booleans );

        System.out.println( values );

    }

    public static int countTrue(boolean[] arr) {

        int sum = 0;

        for ( boolean value : arr ) {

            if (value) sum += 1;

        }

        return sum;

    }

}

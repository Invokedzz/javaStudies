package Challenge.fifthChallenge.src;

import java.util.Scanner;

public class OtherMethod {

    public static void main ( String[] args ) {

        boolean [] trueArray = new boolean[]{ true, false, true, true, false };

        int values = countTrue( trueArray );

        System.out.println( values );

    }

    private static int countTrue(boolean[] arr) {

        int total = 0;

        for (boolean b : arr) {

            if (b) total += 1;

        }

        return total;

    }

}

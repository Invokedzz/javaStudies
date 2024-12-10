package POO.population.app;

import java.util.Scanner;

public class PopulationApp {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainApplication( init );

    }

    private static void mainApplication ( Scanner init ) {

        long demographicValue = 8_000_000_000L;

        int certainTime = init.nextInt();

        for ( int i = 0; i < certainTime; i++ ) {

            long addSomePplInTheUniverse = ( long ) ( demographicValue * 0.011 );

            demographicValue += addSomePplInTheUniverse;

            System.out.printf( "Year: %s | Total: %s | Added value: %s \n",
                    i + 1, demographicValue, addSomePplInTheUniverse );

        }

    }

}

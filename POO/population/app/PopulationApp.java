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

            double addSomePplInTheUniverse = demographicValue * 0.011;

            double getTotalPpl = addSomePplInTheUniverse + demographicValue;

            System.out.printf("Year: %s | Total: %s | Added value: %s \n", i + 1, getTotalPpl, addSomePplInTheUniverse);

        }

    }

}

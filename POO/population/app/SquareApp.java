package POO.population.app;

import java.util.Scanner;

public class SquareApp {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperation ( init );

    }

    private static void mainOperation ( Scanner init ) {

        int chooseSquareSize = init.nextInt();

        for ( int i = 0; i < chooseSquareSize; i++ ) {

            for ( int j = 0; j < chooseSquareSize; j++ ) {

                System.out.print( "*" ); // Dude, this ignores the line skip :000

            }

            System.out.println();

        }

    }

}

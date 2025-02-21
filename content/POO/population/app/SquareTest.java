package content.POO.population.app;

import java.util.Scanner;

public class SquareTest {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperation( init );

    }

    private static void mainOperation ( Scanner init ) {

        int chooseSquareFormat = init.nextInt();

        for ( int i = 0; i < chooseSquareFormat; i++ ) {

            for ( int j = 0; j < chooseSquareFormat; j++ ) {

                for ( int x = 0; x < chooseSquareFormat; x++ ) {

                    System.out.print( "*" );

                }

            }

            System.out.println();

        //    System.out.println(1);

        }

    }

}

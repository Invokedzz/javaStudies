package Challenge.Challenge10th.src;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        List < String > listOfRooks = new ArrayList<>();

        runProgram( listOfRooks, sc );

    }

    private static void runProgram ( List < String > list, Scanner sc ) {

        System.out.println( "Enter the number of rooks you want to analyze!" );

        int numberOfElements = sc.nextInt();

        for ( int index = 0; index < numberOfElements; index ++ ) {

           String rook = sc.next();

           if ( validateRook( rook ) ) list.add( rook );

        }

        for ( String item : list ) {

            System.out.println( item );

        }

    }

    private static boolean validateRook ( String rook ) {

        return Pattern.matches( "^[0-9]*$", rook.subSequence( 1, 1 )) &&
                Pattern.matches( "[a-zA-Z]", rook.subSequence( 0, 1 )) && rook.length() == 2;

    }

}

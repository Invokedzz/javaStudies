package Challenge.Challenge10th.src;

import java.util.ArrayList;

import java.util.InputMismatchException;

import java.util.List;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        List < String > listOfRooks = new ArrayList<>();

        runProgram( listOfRooks, sc );

    }

    private static void runProgram ( List < String > listOfRooks, Scanner sc ) {

        try {

            System.out.println( "Enter the number of rooks you want to analyze!" );

            int numberOfElements = sc.nextInt();

            for ( int index = 0; index < numberOfElements; index ++ ) {

                String rook = sc.next();

                if ( validateRook( rook ) ) {

                    listOfRooks.add( rook + ", " + "id: " + index );

                    System.out.printf( "%s added to the list!\n", rook );

                }

            }

            queryRooksSentByUser( listOfRooks, sc );

        } catch ( InputMismatchException error ) {

            System.out.printf( "Wrong input. Return: %s\n", error.getMessage() );

        }

    }

    private static boolean validateRook ( String rook ) {

        return Pattern.matches( "[1-8]+$", rook.subSequence( 1, 2 )) &&
                Pattern.matches( "[a-hA-H]", rook.subSequence( 0, 1 )) && rook.length() == 2;

    }

    private static void queryRooksSentByUser ( List < String > listOfRooks, Scanner sc ) {

        System.out.println( "Select the id of the rook you want to use: " );

        for ( String item : listOfRooks ) {

            System.out.println( item );

        }

        int firstRookId = sc.nextInt();

        String firstRook = listOfRooks.get( firstRookId );

        System.out.println( "Good! Now, enter the id of the rook that is going to be under attack: " );

        int secondRookId = sc.nextInt();

        String secondRook = listOfRooks.get( secondRookId );

        System.out.printf("The first rook manages to attack the second one? Answer: %s", logicForRookInsideOfAGameOfChess( firstRook, secondRook ));

    }

    private static boolean logicForRookInsideOfAGameOfChess ( String firstRook, String secondRook ) {

        return firstRook.charAt(0) == secondRook.charAt(0) || firstRook.charAt(1) == secondRook.charAt(1);

    }

}

package LambdaJavaDoc.src.FirstExample.src.application;

import LambdaJavaDoc.src.FirstExample.src.services.IntegerMath;

import java.util.Scanner;

public class Calculator {

    public static void main ( String[] args ) {

        IntegerMath addition = Integer::sum;

        IntegerMath subtraction = (a, b) -> a - b;

        IntegerMath multiplication = (a, b) -> a * b;

        IntegerMath division = (a, b) -> a  / b;

        int additionResult = doOperation( returnARandomInteger(), returnARandomInteger(), addition );

        int subtractionResult = doOperation( returnARandomInteger(), returnARandomInteger(), subtraction );

        int multiplicationResult = doOperation( returnARandomInteger(), returnARandomInteger(), multiplication );

        int divisionResult = doOperation( returnARandomInteger(), returnARandomInteger(), division );

        System.out.printf( "%s\n%s\n%s\n%s", additionResult, subtractionResult, multiplicationResult, divisionResult );

    }

    private static int doOperation ( int valueA, int valueB, IntegerMath op ) {

        return op.operations( valueA, valueB );

    }

    private static int returnARandomInteger () {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Enter with an integer: " );

        return sc.nextInt();

    }

}

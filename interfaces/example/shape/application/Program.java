package interfaces.example.shape.application;

import interfaces.example.shape.services.*;

import interfaces.example.shape.entities.*;

public class Program {

    public static void main ( String[] args ) {

        runProgram ();

    }

    private static void runProgram () {

        Circle circle = new Circle( 10.0 );

        Square square = new Square( 2.0 );

        SquareArea squareArea = new SquareArea( square );

        CircleArea circleArea = new CircleArea( circle );

        double result = squareArea.calculateArea();

        double result2 = circleArea.calculateArea();

        System.out.printf("Square Area: %s\nCircle Area: %s", result, result2 );

    }

}

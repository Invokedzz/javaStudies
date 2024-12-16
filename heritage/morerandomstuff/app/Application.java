package heritage.morerandomstuff.app;

import heritage.morerandomstuff.entities.Shape;

import heritage.morerandomstuff.entities.Circle;

import heritage.morerandomstuff.entities.Rectangle;

import heritage.morerandomstuff.entities.enums.Color;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class Application {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        mainOperation ( init );

    }

    private static void mainOperation ( Scanner init ) {

        List < Shape > shapeList = new ArrayList<>();

        System.out.println( "Enter the number of shapes: " );

        int numberOfShapes = init.nextInt();

        for ( int i = 0; i < numberOfShapes; i ++ ) {

            System.out.printf( "Shape #%s data\n", i + 1 );

            System.out.println( "Rectangle or Circle (r/c)?" );

            char rectangleOrCircle = init.next().charAt( 0 );

            System.out.println("Color (BLACK/RED/BLUE): ");

            Color color = Color.valueOf( init.next() );

            if ( rectangleOrCircle == 'r' || rectangleOrCircle == 'R' ) {

                System.out.println( "Width: " );

                double width = init.nextDouble();

                System.out.println( "Height: " );

                double height = init.nextDouble();

                shapeList.add( new Rectangle( width, height, color) );

            }

            if ( rectangleOrCircle == 'c' || rectangleOrCircle == 'C' ) {

                System.out.println( "Radius: " );

                double radius = init.nextDouble();

                shapeList.add( new Circle( radius, color ) );

            }

        }

        System.out.println();

        for ( Shape shape : shapeList ) {

            System.out.printf( "Total area: %s\n", shape.area() );

        }

        init.close();

    }

}

package generics.wildcard.secondencounter.src.application;

import generics.wildcard.secondencounter.src.model.entities.*;

import generics.wildcard.secondencounter.src.model.services.*;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main ( String[] args ) {

        mainOperations();

    }

    private static void mainOperations () {

        List < Shape > shapeList = new ArrayList<>();

        List < Shape > shapeList2 = new ArrayList<>();

        shapeList.add( new Rectangle( 10.0, 20.0 ) );

        shapeList2.add( new Circle( 10.0 ) );

        showElementsFromRectangleList ( shapeList );

        showElementsFromCircleList ( shapeList2 );

    }

    private static void showElementsFromRectangleList ( List < ? extends Shape > list ) {

        for ( Shape element : list ) {

            System.out.printf( "Rectangle Area: %s\n", element.area() );

        }

    }

    private static void showElementsFromCircleList ( List < ? extends Shape > list ) {

        for ( Shape element : list ) {

            System.out.printf( "Circle Area: %s\n", element.area() );

        }

    }

}

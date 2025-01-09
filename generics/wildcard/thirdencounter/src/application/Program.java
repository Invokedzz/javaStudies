package generics.wildcard.thirdencounter.src.application;

import generics.wildcard.thirdencounter.src.model.services.*;

import generics.wildcard.thirdencounter.src.model.entities.*;

public class Program {

    public static void main ( String[] args ) {

        programFunctions();

    }

    private static void programFunctions () {

        Rectangle rectangle = new Rectangle( 10.0, 20.0 );

        Circle circle = new Circle( 10.0 );

        RectangleArea rectangleArea = new RectangleArea( rectangle );

        rectangleArea.createListForFigure();

        CircleArea circleArea = new CircleArea( circle );

        circleArea.createListForFigure();

    }

}

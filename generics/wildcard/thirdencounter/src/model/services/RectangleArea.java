package generics.wildcard.thirdencounter.src.model.services;

import generics.secondexercise.src.model.exceptions.EmptyListException;

import generics.wildcard.thirdencounter.src.model.entities.Rectangle;

import java.util.List;

public class RectangleArea implements Shape {

    private Rectangle rectangle;

    public RectangleArea () {}

    public RectangleArea ( Rectangle rectangle ) {

        this.rectangle = rectangle;

    }

    public Rectangle getRectangle () {

        return rectangle;

    }

    @Override
    public Double area () {

        return getRectangle().getHeight() * getRectangle().getWidth();

    }

    @Override
    public void createListForFigure () {

        list.add( RectangleArea.this );

        printList ( list );

    }

    private void printList ( List < ? extends Shape > list ) {

        if ( list.isEmpty() ) throw new EmptyListException( "The list can't be empty!" );

        for ( Shape item : list ) {

            System.out.println( item );

        }

    }

    @Override
    public String toString () {

        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder();

        stringBuilder.append( "Area: " ).append( area() );

        return stringBuilder.toString();

    }

}

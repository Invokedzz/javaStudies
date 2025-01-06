package interfaces.example.shape.services;

import interfaces.example.shape.entities.Square;

public class SquareArea implements Shape {

    private Square square;

    public SquareArea () {}

    public SquareArea ( Square square ) {

        this.square = square;

    }

    public Square getSquare () {

        return square;

    }

    @Override
    public double calculateArea () {

        return Math.pow( square.getSide(), 2.0 );

    }

}

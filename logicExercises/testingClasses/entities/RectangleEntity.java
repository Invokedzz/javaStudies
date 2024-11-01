package logicExercises.testingClasses.entities;

public class RectangleEntity {

    private double length;

    private double width;

    public void defineLength (double length) {

        this.length = length;

    }

    public void defineWidth (double width) {

        this.width = width;

    }

    public double defineArea () {

        return width * length;

    }

}

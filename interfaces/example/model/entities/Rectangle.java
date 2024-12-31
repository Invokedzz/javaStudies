package interfaces.example.model.entities;

public class Rectangle extends AbstractShape {

    private Double height;

    private Double width;

    public Rectangle () {

        super ();

    }

    public Rectangle ( Color color, Double height, Double width ) {

        super ( color );

        this.height = height;

        this.width = width;

    }

    @Override
    public Double area () {

        return height * width;

    }

}

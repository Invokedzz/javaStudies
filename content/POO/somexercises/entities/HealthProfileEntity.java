package content.POO.somexercises.entities;

public class HealthProfileEntity {

    // name, lastname, gender (String / char), birthdate (LocalDate / String), height (double), weight (double)
    // returnAge (), freqCard (), imcCalculus ()

    private final String name;

    private final String lastName;

    private double height;

    private double weight;

    private final HealthProfileEntityTwo health;

    public HealthProfileEntity ( String name, String lastName, double height, double weight,
                                 HealthProfileEntityTwo health ) {

        this.name = name;

        this.lastName = lastName;

        this.height = height;

        this.weight = weight;

        this.health = health;

    }

    public double imcCalculus () {

        return weight / Math.pow(height, 2);

    }

    public double getHeight () {

        return height / 2.54;

    }

    public double getWeight () {

        return weight * 2.2046;

    }

    public void setHeight ( double height ) {

        if ( height < 0 ) {

            this.height = 0;

            return;

        }

        this.height = height / 2.54;

    }

    public void setWeight ( double weight ) {

        if ( weight < 0 ) {

            this.weight = 0;

            return;

        }

        this.weight = weight * 2.2046;

    }

    @Override
    public String toString () {

        StringBuilder sc;

        sc = new StringBuilder();

        sc.append( "Name: " ).append( name )
                .append( " Last Name: ").append( lastName )
                .append( " Height: ").append( getHeight() )
                .append( "\n Weight: ").append( getWeight() )
                .append(health);

        return sc.toString();

    }

}

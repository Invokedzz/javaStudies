package POO.somexercises.entities;

import java.time.LocalDate;

public class HealthProfileEntity {

    // name, lastname, gender (String / char), birthdate (LocalDate / String), height (double), weight (double)
    // returnAge (), freqCard (), imcCalculus ()

    private String name;

    private String lastName;

    private String gender;

    private LocalDate birthDate;

    private double height;

    private double weight;

    public HealthProfileEntity ( String name, String lastName, String gender, LocalDate birthDate,
                                double height, double weight ) {

        this.name = name;

        this.lastName = lastName;

        this.gender = gender;

        this.birthDate = birthDate;

        this.height = height;

        this.weight = weight;

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
                .append( " Gender: ").append( gender )
                .append( "Birth date: ").append( birthDate )
                .append( "Height: ").append( getHeight() )
                .append( " Weight: ").append( getWeight() );

        return sc.toString();

    }

}

package POO.imc.entities;

public class PatientTwo {

    private final String firstName;

    private final String lastName;

    public PatientTwo ( String firstName, String lastName ) {

        this.firstName = firstName;

        this.lastName = lastName;

    }

    @Override
    public String toString () {

        return " Name: " + firstName +
                " Last Name: " + lastName;

    }

}

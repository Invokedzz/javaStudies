package POO.imc.entities;

public class Patient {

    private final String firstName;

    private final String lastName;

    public Patient (String firstName, String lastName) {

        this.firstName = firstName;

        this.lastName = lastName;

    }

    @Override
    public String toString () {

        return "Name: " + firstName +
                " Last Name: " + lastName;

    }

}

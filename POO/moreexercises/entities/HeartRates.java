package POO.moreexercises.entities;

public class HeartRates {

    private String name;

    private String lastName;

    private HeartRatesBirth ratesBirth;

    public HeartRates ( String name, String lastName, HeartRatesBirth ratesBirth ) {

        this.name = name;

        this.lastName = lastName;

        this.ratesBirth = ratesBirth;

    }

    public void setName ( String name ) {

        if ( name.isEmpty() ) {

            this.name = "Default";

            return;

        }

        this.name = name;

    }

    public void setLastName ( String lastName ) {

        if ( lastName.isEmpty() ) {

            this.lastName = "Default";

            return;

        }

        this.lastName = lastName;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append("Name: ").append(name)
                .append(" Last Name: ").append(lastName)
                .append(ratesBirth);

        return sb.toString();

    }

}

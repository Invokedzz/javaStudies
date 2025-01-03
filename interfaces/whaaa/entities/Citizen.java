package interfaces.whaaa.entities;

public class Citizen implements Comparable <Citizen> {

    private String name;

    private String lastName;

    private Double cash;

    public Citizen () {}

    public Citizen ( String name, String lastName, Double cash ) {

        this.name = name;

        this.lastName = lastName;

        this.cash = cash;

    }

    public String getName () {

        return name;

    }

    public String getLastName () {

        return lastName;

    }

    public Double getCash () {

        return cash;

    }

    @Override
    public int compareTo(Citizen o) {

        return getCash().compareTo( o.getCash() );

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( getName() )
                .append( " Last Name: " ).append( getLastName() )
                .append( ", Cash: " ).append( getCash() );

        return sb.toString();

    }

}

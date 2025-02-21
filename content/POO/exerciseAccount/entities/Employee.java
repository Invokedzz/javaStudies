package content.POO.exerciseAccount.entities;

public class Employee {

    // name ( String ), hours ( Integer ), valuePerHour ( Double )

    // payment (): double

    private String name;

    private Integer hours;

    private Double valuePerHour;

    public Employee () {}

    public Employee ( String name, Integer hours, Double valuePerHour ) {

        this.name = name;

        this.hours = hours;

        this.valuePerHour = valuePerHour;

    }

    public double payment () {

        return hours * valuePerHour;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( name )
                .append( " Hours: " ).append( hours )
                .append( " Value per hour: " ).append( valuePerHour );

        return sb.toString();

    }

}

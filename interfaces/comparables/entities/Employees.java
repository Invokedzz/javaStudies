package interfaces.comparables.entities;

public class Employees implements Comparable <Employees> {

    private String name;

    private Double salary;

    public Employees () {}

    public Employees ( String name, Double salary ) {

        this.name = name;

        this.salary = salary;

    }

    public String getName () {

        return name;

    }

    public Double getSalary () {

        return salary;

    }

    @Override
    public int compareTo (Employees o) {

        return name.compareTo( o.getName() );

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( getName() )
                .append(",").append( getSalary() );

        return sb.toString();

    }

}

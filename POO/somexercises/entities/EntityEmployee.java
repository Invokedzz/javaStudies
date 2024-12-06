package POO.somexercises.entities;

public class EntityEmployee {

    private final String name;

    private final String lastName;

    private double currentSalary;

    public EntityEmployee ( String name, String lastName, double currentSalary ) {

        this.name = name;

        this.lastName = lastName;

        this.currentSalary = currentSalary;

    }

    public void setCurrentSalary (double currentSalary) {

        if (currentSalary > 0) {

            this.currentSalary = currentSalary;

            return;

        }

        System.out.println("Lower than zero, shall not be configured! You shall not pass!");

    }

    public double changeCurrentSalary (double currentSalary) {

        return currentSalary * 12 * 0.10 + currentSalary;

    }

    @Override
    public String toString () {

        StringBuilder sb;
        sb = new StringBuilder();

        sb.append( "Name: " ).append( name )

                .append(" Last Name: ").append( lastName )

                .append(" Current Salary: ").append( currentSalary );

        return sb.toString();

    }

}

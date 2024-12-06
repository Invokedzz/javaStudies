package POO.somexercises.entities;

public class EntityEmployee {

    private String name;

    private String lastName;

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

    @Override
    public String toString () {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append( "Name: " ).append( name )

                .append(" Last Name: ").append( lastName )

                .append(" Current Salary: ").append( currentSalary );

        return stringBuilder.toString();

    }

}

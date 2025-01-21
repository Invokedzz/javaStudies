package Stream.second.model.entities;

public class EmployeeStream {

    private String name;

    private String email;

    private Double salary;

    public EmployeeStream () {}

    public EmployeeStream ( String name, String email, Double salary ) {

        this.name = name;

        this.email = email;

        this.salary = salary;

    }

    public String getName () {

        return name;

    }

    public String getEmail () {

        return email;

    }

    public Double getSalary () {

        return salary;

    }

    @Override
    public String toString () {

        return getName() + " " + getEmail() + " " + getSalary();

    }

}

package Stream.second.model.entities;

public class EmployeeStream {

    private String email;

    private Double salary;

    public EmployeeStream () {}

    public EmployeeStream ( String email, Double salary ) {

        this.email = email;

        this.salary = salary;

    }

    public String getEmail () {

        return email;

    }

    public Double getSalary () {

        return salary;

    }

    @Override
    public String toString () {

        return getEmail() + " " + getSalary();

    }

}

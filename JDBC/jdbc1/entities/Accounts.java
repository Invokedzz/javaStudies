package JDBC.jdbc1.entities;

public class Accounts {

    private String name;

    private String email;

    private Double salary;

    public Accounts () {}

    public Accounts (String name, String email, Double salary) {

        this.name = name;

        this.email = email;

        this.salary = salary;

    }

    public String getName() {

        return name;

    }

    public String getEmail() {

        return email;

    }

    public Double getSalary() {

        return salary;

    }

    @Override
    public String toString() {
        return "Accounts{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }

}

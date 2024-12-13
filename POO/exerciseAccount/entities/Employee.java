package POO.exerciseAccount.entities;

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

}

package generics.fourthexercise.src.model.entities;

import java.util.ArrayList;

import java.util.List;

public abstract class Employee {

    private String name;

    private String id;

    private Double salary;

    public Employee () {}

    public Employee ( String name, String id, Double salary ) {

        this.name = name;

        this.id = id;

        this.salary = salary;

    }

    public String getName () {

        return name;

    }

    public String getId () {

        return id;

    }

    public Double getSalary () {

        return salary;

    }

    @Override
    public String toString () {

        StringBuilder stringBuilder;

        stringBuilder = new StringBuilder();

        stringBuilder.append( "Name: " ).append( getName() )
                .append( ", Id: " ).append( getId() )
                .append( " Salary: ").append( getSalary() );

        return stringBuilder.toString();

    }

}

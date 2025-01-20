package LambdaJavaDoc.SmallExerciseReview.src.model.entities;

import LambdaJavaDoc.SmallExerciseReview.src.model.enums.EmployeeStats;

public class EmployeeMain {

    private String name;

    private String id;

    private Double salary;

    private EmployeeStats stats;

    public EmployeeMain () {}

    public EmployeeMain ( String name, String id, Double salary, EmployeeStats stats ) {

        this.name = name;

        this.id = id;

        this.salary = salary;

        this.stats = stats;

    }

    public String getId () {

        return id;

    }

    public Double getSalary () {

        return salary;

    }

    public EmployeeStats getStats () {

        return stats;

    }

    @Override
    public String toString() {
        return "EmployeeMain{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", stats=" + stats +
                '}';
    }
}

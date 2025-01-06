package practice.model.entities;

public abstract class AbstractEmployee implements Employee {

    private String name;

    private String id;

    private Double salary;

    public AbstractEmployee () {}

    public AbstractEmployee ( String name, String id, Double salary ) {

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

}

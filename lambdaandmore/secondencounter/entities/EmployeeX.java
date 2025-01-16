package lambdaandmore.secondencounter.entities;

import lambdaandmore.secondencounter.services.RandomEmployeesInterface;

import java.util.ArrayList;
import java.util.List;

public class EmployeeX {

    private String name;

    private String id;

    public EmployeeX () {}

    public EmployeeX(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EmployeeX{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

}

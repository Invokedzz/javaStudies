package composition.entities;

public class Department {

    private String name;

    public Department (String departmentName) {

        this.name = departmentName;

    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return name;
    }

}

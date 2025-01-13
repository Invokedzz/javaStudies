package generics.set.firstencounter.entities;

public class Employee implements Comparable < Employee > {

    private String employeeName;

    private Integer employeeId;

    public Employee () {}

    public Employee ( String employeeName, Integer employeeId ) {

        this.employeeName = employeeName;

        this.employeeId = employeeId;

    }

    public String getEmployeeName () {

        return employeeName;

    }

    public Integer getEmployeeId () {

        return employeeId;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Employee name: " ).append( getEmployeeName() )
                .append( ", Employee id: " ).append( getEmployeeId() );

        return sb.toString();

    }

    @Override
    public int compareTo(Employee o) {

        return getEmployeeId().compareTo( o.getEmployeeId() );

    }
}

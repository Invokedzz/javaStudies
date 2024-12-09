package POO.control.entities;

import POO.control.entities.status.StudentStatus;

public class StudentEntity {

    private final String name;

    private final String lastName;

    private final int id;

    private final double grades;

    private final StudentStatus status;

    public StudentEntity ( String name, String lastName, int id, double grades, StudentStatus status ) {

        this.name = name;

        this.lastName = lastName;

        this.id = id;

        this.grades = grades;

        this.status = status;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( name )
                .append( " Last Name: " ).append( lastName )
                .append( " Id: ").append( id )
                .append( " Grades: ").append( grades )
                .append( " Status: ").append( status );

        return sb.toString();

    }

}

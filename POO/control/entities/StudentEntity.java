package POO.control.entities;

import POO.control.entities.status.StudentStatus;

public class StudentEntity {

    private String name;

    private String lastName;

    private int id;

    private double grades;

    public StudentEntity ( String name, String lastName, int id, double grades ) {

        this.name = name;

        this.lastName = lastName;

        this.id = id;

        this.grades = grades;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( name )
                .append( " Last Name: " ).append( lastName )
                .append( " Id: " ).append( id )
                .append( " Grades: " ).append( grades );

    }

}

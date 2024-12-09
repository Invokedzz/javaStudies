package POO.control.entities;

public class StudentEntity {

    private final String name;

    private final String lastName;

    private final int id;

    private final double grades;

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
                .append( " Id: ").append( id )
                .append( " Grades: ").append( grades );

        return sb.toString();

    }

}

package POO.control.entities;

import POO.control.entities.status.StudentStatus;

import java.util.ArrayList;

import java.util.List;

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

    List < StudentEntity > entityList = new ArrayList<>();

    public void addStudent ( StudentEntity student ) {

        entityList.add( student );

    }

    public void removeStudent ( StudentEntity student ) {

        entityList.remove( student );

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append("Students: ");

        for (StudentEntity student: entityList) {

            System.out.println(student);

            if (student.grades < 7) StudentStatus.valueOf( "FAILED" );

            StudentStatus.valueOf( "APPROVED" );
        }

        return sb.toString();

    }

}

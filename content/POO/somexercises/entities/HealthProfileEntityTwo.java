package content.POO.somexercises.entities;

import java.time.LocalDate;

public class HealthProfileEntityTwo {

    private final String gender;

    private final LocalDate birthDate;

    public HealthProfileEntityTwo ( String gender, LocalDate birthDate ) {

        this.gender = gender;

        this.birthDate = birthDate;

    }

    public int fcMaxForMen ( int birthDate ) {

        int age = LocalDate.now().getYear() - birthDate;

        return 220 - age;

    }

    public int fcMaxForWomen ( int birthDate ) {

        int age = LocalDate.now().getYear() - birthDate;

        return 226 - age;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append(" Birth Date: ").append(birthDate)
                .append(" Gender: ").append(gender);

        return sb.toString();

    }

}

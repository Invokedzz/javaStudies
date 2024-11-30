package Client.entities;

import java.time.LocalDate;

import java.text.SimpleDateFormat;

public class Client {

    private String name;

    private String email;

    private LocalDate birthDate;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Client (String name, String email, LocalDate birthDate) {

        this.name = name;

        this.email = email;

        this.birthDate = birthDate;

    }

    @Override
    public String toString () {

        return name + " " +
                email + " " +
                dateFormat.format(birthDate);

    }

}

package review.withoutinterfacessagain.model.entities;

import java.time.LocalDate;

public class Client {

    private String clientName;

    private String email;

    private LocalDate date;

    public Client () {}

    public Client ( String clientName, String email, LocalDate date ) {

        this.clientName = clientName;

        this.email = email;

        this.date = date;

    }

    public String getClientName () {

        return clientName;

    }

    public String getEmail () {

        return email;

    }

    public LocalDate getDate () {

        return date;

    }

}

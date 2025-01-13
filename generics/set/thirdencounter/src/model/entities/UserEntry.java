package generics.set.thirdencounter.src.model.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserEntry {

    private String username;

    private LocalDateTime date;

    public UserEntry () {}

    public UserEntry ( String username, LocalDateTime date ) {

        this.username = username;

        this.date = date;

    }

    public String getUsername () {

        return username;

    }

    public LocalDateTime getDate () {

        return date;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntry userEntry = (UserEntry) o;
        return username.equals(userEntry.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}

package VideogameStore.model.entities;

import VideogameStore.model.enums.UserStatus;

public class UserProfile {

    private final String firstName;

    private final String lastName;

    private final String password;

    private final UserStatus status;

    public UserProfile (String firstName, String lastName, String password, UserStatus status) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.password = password;

        this.status = status;

    }

    public String getPassword () {

        return password;

    }

    @Override
    public String toString () {

        return "Name: " + firstName
                + " Last Name: " + lastName
                + " Password: " + password +
                " Status: " + status;

    }

}

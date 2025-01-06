package interfaces.test.services;

import interfaces.test.entities.User;

import java.io.*;

public class DataLoader implements ExecData {

    private User user;

    public DataLoader () {}

    public DataLoader ( User user ) {

        this.user = user;

    }

    public User getUser () {

        return user;

    }

    @Override
    public boolean isUserValid () {

        return !getUser().getUsername().isEmpty() && getUser().getId().length() == 5;

    }

}

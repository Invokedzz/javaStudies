package VideogameStore.app;

import VideogameStore.model.entities.UserProfile;

import VideogameStore.model.enums.UserStatus;

public class MainApp {

    public static void main (String[] args) {

        mainOp();

    }

    private static void mainOp () {

        UserProfile profile = new UserProfile("Paul", "Washington", "1234", UserStatus.MEMBER);

        System.out.println(profile);

    }

}

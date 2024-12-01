package VideogameStore.app;

import VideogameStore.model.entities.GamesInfo;

import VideogameStore.model.entities.UserProfile;

import VideogameStore.model.enums.UserStatus;

import VideogameStore.model.entities.GamesOverlook;

import VideogameStore.model.enums.ProductsAvailability;

import java.time.LocalDate;

public class MainApp {

    public static void main (String[] args) {

        mainOp();

    }

    private static void mainOp () {

        UserProfile profile = new UserProfile("Paul", "Washington", "1234", UserStatus.MEMBER);

        System.out.println(profile);

        GamesInfo info = new GamesInfo("Dark Souls", 100.0, ProductsAvailability.AVAILABLE);

        GamesOverlook overlook = new GamesOverlook(LocalDate.now(), "Adventure", info);

        System.out.println(overlook);

    }

}

package VideogameStore.app;

import VideogameStore.model.entities.GamesInfo;

import VideogameStore.model.entities.UserProfile;

import VideogameStore.model.enums.UserStatus;

import VideogameStore.model.entities.GamesOverlook;

import VideogameStore.model.enums.ProductsAvailability;

import VideogameStore.model.entities.Store;

import VideogameStore.model.enums.DeliveryStatus;

import java.time.LocalDate;

import java.util.Scanner;

public class MainApp {

    public static void main (String[] args) {

        mainOp();

    }

    private static void mainOp () {

        Scanner init = new Scanner (System.in);

        int selectOption = init.nextInt();

        allOptionsAvailable(selectOption, init);

    }

    private static void allOptionsAvailable (int selectOption, Scanner init) {

        System.out.println("Choose an option: ");

        switch (selectOption) {

            case 1:

                accessUserProfile(init);
                break;

            case 2:

                accessGameStore(init);
                break;

            default:
                System.out.println("Enter a valid option!");
                break;
        }

    }

    private static UserProfile accessUserProfile (Scanner init) {

        // UserProfile = first name, last name, password, status

        System.out.println("Enter your first name: ");

        String firstName = init.next();

        System.out.println("Enter your last name: ");

        String lastName = init.next();

        System.out.println("Enter your password: ");

        String password = init.next();

        System.out.println("Enter your current status (INCOGNITO, MEMBER, PREMIUM_MEMBERSHIP): ");

        UserStatus userStatus = UserStatus.valueOf(init.next());

        return new UserProfile(firstName, lastName, password, userStatus);

    }

    private static void accessGameStore (Scanner init) {

        // UserProfile, GamesOverlook, DeliveryStatus

        // GamesOverlook = gamesInfo (GamesInfo), releaseGameDate (LocalDate), gameGenre (String)

        // DeliveryStatus -> enum

        UserProfile getElements = accessUserProfile(init);

        System.out.println(getElements);

    }

}

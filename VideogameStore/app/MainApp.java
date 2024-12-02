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

    private static GamesOverlook gamesOverlook (Scanner init) {

        // GamesOverlook = gamesInfo (GamesInfo), releaseGameDate (LocalDate), gameGenre (String)

        System.out.println("Enter the game release date: ");

        LocalDate date = LocalDate.now();

        System.out.println("Enter the game genre: ");

        String gameGenre = init.next();

        GamesInfo gamesInfo = gamesInfo(init);

        return new GamesOverlook(date, gameGenre, gamesInfo);

    }

    private static GamesInfo gamesInfo (Scanner init) {

        // GamesInfo = String gameName, Double gamePrice, ProductsAvailability availability

        System.out.println("Enter the game name: ");

        String gameName = init.next();

        System.out.println("Enter the game price: ");

        double gamePrice = init.nextDouble();

        System.out.println("Enter the product availability: ");

        ProductsAvailability availability = ProductsAvailability.AVAILABLE;

        return new GamesInfo(gameName, gamePrice, availability);

    }

    private static void accessGameStore (Scanner init) {

        // UserProfile, GamesOverlook, DeliveryStatus

        // UserProfile profile, GamesOverlook overlook, DeliveryStatus status -> Store

        // DeliveryStatus -> enum

        UserProfile getProfileElements = accessUserProfile(init);

        GamesOverlook getGamesElements = gamesOverlook(init);

        DeliveryStatus status = DeliveryStatus.PENDING_PAYMENT;

        Store store = new Store(getProfileElements, getGamesElements, status);

        System.out.println(store);

    }

}

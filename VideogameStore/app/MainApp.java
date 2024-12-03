package VideogameStore.app;

import VideogameStore.model.entities.GamesInfo;

import VideogameStore.model.entities.UserProfile;

import VideogameStore.model.enums.UserStatus;

import VideogameStore.model.entities.GamesOverlook;

import VideogameStore.model.enums.ProductsAvailability;

import VideogameStore.model.entities.Store;

import VideogameStore.model.enums.DeliveryStatus;

import VideogameStore.model.validators.ScannerValidator;

import VideogameStore.model.entities.GamesCatalog;

import java.time.LocalDate;

import java.util.Scanner;

import java.time.format.DateTimeFormatter;

import java.util.ArrayList;

import java.util.List;

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

                // GameCatalog function is going to replace "accessUserProfile"

                accessGameCatalog(init);
                break;

            case 2:

                accessGameStore(init);
                break;

            default:
                System.out.println("Enter a valid option!");
                break;
        }

    }

    private static void accessGameCatalog (Scanner init) {

        List <GamesCatalog> catalogList = new ArrayList<>();

        System.out.println("Enter the number of games you want to register: ");

        int numberOfGames = ScannerValidator.returnIntegerInput(init);

        for (int i = 0; i < numberOfGames; i++) {

            System.out.println("Enter the game name: ");

            String gameName = init.next();

            System.out.println("Enter the game id: ");

            int gameId = ScannerValidator.returnIntegerInput(init);

            while (validateIdInputs(catalogList, gameId)) {

                System.out.println("Enter a valid id!");

                gameId = ScannerValidator.returnIntegerInput(init);

            }

            System.out.println("Enter the product availability: (AVAILABLE/OUT_OF_STOCK)");

            ProductsAvailability availability = ProductsAvailability.valueOf(init.next());

            GamesCatalog catalog = new GamesCatalog(gameName, gameId, availability);

            catalogList.add(catalog);

            System.out.println(catalogList);

        }

    }

    private static boolean validateIdInputs (List <GamesCatalog> catalogList, int elementId) {

        GamesCatalog list = catalogList.stream()
                .filter(x -> x.getGameId().equals(elementId))
                .findFirst().orElse(null);

        return list != null;

    }

    private static void findIdPosition (List <GamesCatalog> catalogList, int elementId) {

    }

    private static UserProfile accessUserProfile (Scanner init) {

        // UserProfile = first name, last name, password, status

        System.out.println("Enter your first name: ");

        String firstName = init.next().toUpperCase();

        System.out.println("Enter your last name: ");

        String lastName = init.next().toUpperCase();

        System.out.println("Enter your password: ");

        String password = ScannerValidator.verifyPassword(init); // Variable we can review, so it can only return a String

        System.out.println("Enter your current status (INCOGNITO, MEMBER, PREMIUM_MEMBERSHIP): \n");

        UserStatus userStatus = UserStatus.valueOf(init.next());

        return new UserProfile(firstName, lastName, password, userStatus);

    }

    private static GamesOverlook gamesOverlook (Scanner init) {

        // GamesOverlook = gamesInfo (GamesInfo), releaseGameDate (LocalDate), gameGenre (String)

        System.out.println("Enter the game release date: ");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(init.next(), dateTimeFormatter);

        System.out.println("Enter the game genre: \n");

        String gameGenre = init.next().toUpperCase();

        GamesInfo gamesInfo = gamesInfo(init);

        return new GamesOverlook(date, gameGenre, gamesInfo);

    }

    private static GamesInfo gamesInfo (Scanner init) {

        // GamesInfo = String gameName, Double gamePrice, ProductsAvailability availability

        System.out.println("Enter the game name: ");

        String gameName = init.next().toUpperCase();

        System.out.println("Enter the game price: ");

        double gamePrice = ScannerValidator.returnDoubleValue(init);

        System.out.println("Enter the product availability: \n");

        // ProductsAvailability = OUT_OF_STOCK, AVAILABLE;

        ProductsAvailability availability = ProductsAvailability.valueOf(init.next());

        DeliveryStatus info = GamesInfo.verifyAvailability(availability);

        return new GamesInfo(gameName, gamePrice, info);

    }

    private static void accessGameStore (Scanner init) {

        // UserProfile, GamesOverlook, DeliveryStatus

        // UserProfile profile, GamesOverlook overlook, DeliveryStatus status -> Store

        // DeliveryStatus -> enum

        // Need to receive DeliveryStatus and ProductsAvailability

        UserProfile getProfileElements = accessUserProfile(init);

        GamesOverlook getGamesElements = gamesOverlook(init);

        // DeliveryStatus = PENDING_PAYMENT, PROCESSING_PAYMENT, SHIPPED, NOT FOUND...

        System.out.println("Enter the delivery status for this project: ");

        DeliveryStatus status = DeliveryStatus.valueOf(init.next());

        Store store = new Store(getProfileElements, getGamesElements, status);

        Store getStoreElements = store.canShip(status);

        System.out.println(getStoreElements);

    }

}

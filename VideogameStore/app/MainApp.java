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

        allOptionsAvailable(selectOption);

    }

    private static void allOptionsAvailable (int selectOption) {

        System.out.println("Choose an option: ");

        switch (selectOption) {

            case 1:

                accessUserProfile();
                break;

            case 2:

                accessGameStore();
                break;

            default:
                System.out.println("Enter a valid option!");
                break;
        }

    }

    private static void accessUserProfile () {



    }

    private static void accessGameStore () {

    }

}

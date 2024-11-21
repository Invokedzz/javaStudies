package arrays.ArrayList.app;

import arrays.ArrayList.entities.ArrayListEntity;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class MoreArrayList {

    public static void main (String[] args) {

        gameStoreApp();

    }

    private static void gameStoreApp () {

        Scanner initSc = new Scanner(System.in);

        System.out.println("How many games you want to register?");

        int loopController = validateIfGreaterThanZero(initSc);

        List <ArrayListEntity> list = new ArrayList<>();

        for (int i = 0; i < loopController; i++) {

            System.out.println("Enter the product name: ");

            String gameName = initSc.next();

            System.out.println("Enter the product Id: ");

            Integer gameId = validateScannerInput(initSc);

            ArrayListEntity game = new ArrayListEntity(gameName, gameId);

            list.add(game);

        }

    }

    private static Integer findIdPosition (List <ArrayListEntity> list, Integer elementId) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getGameId() == elementId) return i;

        }

        return null;

    }

    private static boolean reviewScannerIntegerMethod (Scanner initSc) {

        return initSc.hasNextInt();

    }

    private static Integer validateScannerInput (Scanner initSc) {

        while (!reviewScannerIntegerMethod(initSc)) {

            System.out.println("Enter a valid number");

            initSc.next();

        }

        return initSc.nextInt();

    }

    private static int validateIfGreaterThanZero (Scanner initSc) {

        int number = validateScannerInput(initSc);

        while (number <= 0) {

            System.out.println("The value must be greater than zero");

            number = validateScannerInput(initSc);

        }

        return number;

    }

}

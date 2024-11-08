package POO.AppFour;

import java.util.Scanner;

import java.util.Locale;

import POO.EntityFour.FarmEntity;

public class FarmClass {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveFarmInformation();

    }

    public static void receiveFarmInformation () {

        Scanner initScanner = new Scanner (System.in);

        String animalsName = initScanner.next();

        double foodQty = readPositivesOnly(initScanner);

        double playTime = readPositivesOnly(initScanner);

        double animalHappiness = readPositivesOnly(initScanner);

        if (foodQty == -1) return;

        else if (playTime == -1) return;

        else if (animalHappiness == -1) return;

        FarmEntity properValues = new FarmEntity(animalsName);

        properValues.feedAllOfThem(foodQty);

        properValues.playWithThem(animalHappiness, playTime);

        System.out.println(properValues);

        initScanner.close();

    }

    public static double readPositivesOnly (Scanner scanner) {

        if (scanner.hasNextDouble()) {

            double testValue = scanner.nextDouble();

            if (testValue > 0) return testValue;

            else {

                System.out.println("Bigger than zero");
                return -1;

            }

        } else {

            System.out.println("Waiting for a proper value!");
            scanner.next();
            return -1;

        }

    }

}

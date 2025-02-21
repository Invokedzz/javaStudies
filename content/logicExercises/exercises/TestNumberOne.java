package content.logicExercises.exercises;

import java.util.Scanner;

public class TestNumberOne {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        double receiveKm = initSc.nextDouble();

        if (receiveKm > 80) {

            System.out.println("Foi m!");

            double kmReserved = receiveKm - 80.0;

            double totalResult = kmReserved * 5.0;

            System.out.println(totalResult);

        }

    }

}

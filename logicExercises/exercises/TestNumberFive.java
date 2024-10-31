package logicExercises.exercises;

import java.util.Scanner;

public class TestNumberFive {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        double travelRoadMap = initSc.nextDouble();

        double totalSpent = travelRoadMap - 200;
        double result;

        if (travelRoadMap > 200) {

            result = totalSpent * 0.45;
            double totalResult = travelRoadMap + result;

            System.out.println(totalResult);

        }

        else {

            result = totalSpent * 0.50;
            double totalResult = travelRoadMap + result;

            System.out.println(totalResult);

        }


    }

}

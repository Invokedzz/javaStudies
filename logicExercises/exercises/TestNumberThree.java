package logicExercises.exercises;

import java.util.Scanner;

public class TestNumberThree {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        double salaryF = initSc.nextDouble();

        if (salaryF > 1250.00) {

            double reaValue = salaryF * 0.10;

            double totalResult = reaValue + salaryF;

            System.out.println(totalResult);

        }

        else {

            double reValue = salaryF * 0.15;

            double totalResult = reValue + salaryF;

            System.out.println(totalResult);

        }

    }

}

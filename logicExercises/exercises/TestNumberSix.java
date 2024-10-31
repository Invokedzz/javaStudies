package logicExercises.exercises;

import java.util.Scanner;

public class TestNumberSix {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        double receiveResult, result;

        double salaryC = initSc.nextDouble();

        if (salaryC >= 500.0 && salaryC <= 1000.0) {

            result = salaryC * 0.10;

            receiveResult = salaryC + result;

            System.out.println(receiveResult);

        }

        else if (salaryC > 1000) {

            result = salaryC * 0.05;

            receiveResult = result + salaryC;

            System.out.println(receiveResult);

        }

        else if (salaryC < 500) {

            result = salaryC * 0.15;

            receiveResult = salaryC + result;

            System.out.println(receiveResult);

        }

        else System.out.println("Error");

    }

}

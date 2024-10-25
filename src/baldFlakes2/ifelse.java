package src.baldFlakes2;

import java.util.Scanner;

public class ifelse {

    public static void main (String[] args) {

        learningLo(args);

    }

    public static void learningLo (String[] args) {

        Scanner sc = new Scanner(System.in);

        int hours;

        hours = sc.nextInt();

        if (hours <= 12) {

            System.out.println("Good morning, friend!\n");

        } else {

            if (hours <= 18) {

                System.out.println("Good afternoon, friend!\n");

            } else {

                System.out.println("Good night, friend!\n");

            }

        }

    }

}

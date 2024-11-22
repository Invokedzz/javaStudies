package arrays.ArrayList.app;

import arrays.ArrayList.entities.ExeArrayListEntity;

import java.util.List;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.Locale;

public class ExeArrayList {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        reviewOfArrayList();

    }

    private static void reviewOfArrayList () {

        Scanner init = new Scanner(System.in);

        List <ExeArrayListEntity> list = new ArrayList<>();

        int controlValue = init.nextInt();

        for (int i = 0; i < controlValue; i++) {

            System.out.println("Enter your name: ");

            String userName = init.next();

            System.out.println("Enter your age: ");

            Integer userAge = init.nextInt();

            ExeArrayListEntity user = new ExeArrayListEntity(userName, userAge);

            list.add(user);

        }

        for (int i = 0; i < list.size(); i++) {

        }

    }

}

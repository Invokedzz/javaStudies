package arrays.someStuff;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class LearnList {

    public static void main (String[] args) {

        List<Integer> ourFirstList = new ArrayList<>();

        ourFirstList.add(3);
        ourFirstList.add(1);
        ourFirstList.add(2);
        ourFirstList.add(3, 10); // Add an element on a certain index;

        System.out.println(ourFirstList.size()); // Show list size (length);
        System.out.println(ourFirstList);

        for (Integer elements: ourFirstList) {
            System.out.println(elements);
        }

        System.out.println("------------------------");

    }

}

package LambdaJavaDoc.src.SmallExercise.src.application;

import LambdaJavaDoc.src.Example7th.src.entities.ProductA;
import LambdaJavaDoc.src.SmallExercise.src.model.entities.ProductAB;
import LambdaJavaDoc.src.SmallExercise.src.model.services.DoOperations;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main (String[] args) {

        testProgram();

    }

    private static void testProgram () {

        List < ProductAB > list = new ArrayList<>();

        list.add(new ProductAB("Tv", 900.00));

        list.add(new ProductAB("Mouse", 50.00));

        list.add(new ProductAB("Tablet", 350.50));

        list.add(new ProductAB("HD Case", 80.90));

        DoOperations operations = new DoOperations( new ProductAB("T", 0.0));

        System.out.println(operations.filterData(list));

    }

}

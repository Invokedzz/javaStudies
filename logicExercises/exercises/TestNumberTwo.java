package logicExercises.exercises;

import java.util.Scanner;

public class TestNumberTwo {

    public static void main (String[] args) {

        Scanner scInit = new Scanner (System.in);
        
        double a, b, c;
        
        a = scInit.nextDouble();
        
        b = scInit.nextDouble();
        
        c = scInit.nextDouble();
        
        double returnedValue = receiveValues(a, b, c);
        
        System.out.println(returnedValue);

    }
    
    public static double receiveValues (double a, double b, double c) {
        
        double highestValue = 0;
        
        if (a > b && a > c) highestValue = a;
        
        else if (b > a && b > c) highestValue = b;
        
        else if (c > a && c > b) highestValue = c;
        
        else System.out.println("Error");
        
        return highestValue;
        
    }

}

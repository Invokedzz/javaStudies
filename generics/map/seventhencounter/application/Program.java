package generics.map.seventhencounter.application;

import generics.map.seventhencounter.model.entities.NumbersValue;

import generics.map.seventhencounter.model.entities.NumbersOrder;

import java.util.*;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        runningTheProgram ( sc );

    }

    private static void runningTheProgram ( Scanner sc ) {

        NavigableMap < NumbersOrder, NumbersValue > map = new TreeMap<>(Comparator.comparing( NumbersOrder::getNumbersKey ));

        int numberOfElements = sc.nextInt();

        for ( int index = 0; index < numberOfElements; index ++ ) {

            NumbersOrder numbersOrder = new NumbersOrder( logicBehindNumbers( sc.next(), sc ) );

            NumbersValue numbersValue = new NumbersValue( logicBehindNumbers( sc.next(), sc ) );

            map.put( numbersOrder, numbersValue );

        }

        for ( Map.Entry < NumbersOrder, NumbersValue > entry : map.descendingMap().entrySet() ) {

            System.out.println( entry.getValue() + " " + entry.getKey() );

        }

    }

    private static String logicBehindNumbers ( String number, Scanner sc ) {

        System.out.println( "Enter a number!" );

        while ( number.equals( "^[0-9]*$\n") ) {

            System.out.println( "Enter a valid value!" );

            sc.next();

        }

        return sc.next();

    }

}

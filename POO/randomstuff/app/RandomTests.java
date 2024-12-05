package POO.randomstuff.app;

import POO.randomstuff.entities.RandomEntitiesForRandomTests;

import javax.swing.JOptionPane;

public class RandomTests {

    public static void main ( String[] args ) {

        mainFunction();

    }

    private static void mainFunction () {

        RandomEntitiesForRandomTests randomTests = new RandomEntitiesForRandomTests("Hello!");

        String getTheGet = randomTests.getWriteSomethingHere();

        randomTests.setWriteSomethingHere("Haha, we changed something here, dummy!");

        String getElement = randomTests.returnSomeKindOfDumbText();

        System.out.printf( "%s, %s", getElement, getTheGet );

    }

}

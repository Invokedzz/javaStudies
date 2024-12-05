package POO.randomstuff.app;

import POO.randomstuff.entities.RandomEntitiesForRandomTests;

import javax.swing.JOptionPane;

public class RandomTests {

    public static void main ( String[] args ) {

        mainFunction();

    }

    private static void mainFunction () {

        JOptionPane.showMessageDialog(null, "Welcome!");

        JOptionPane.showMessageDialog(null, "How are you?");

        JOptionPane.showOptionDialog(
                null
                , "Question?"        // Message
                , "Title"               // Title
                , JOptionPane.YES_NO_OPTION
                , JOptionPane.PLAIN_MESSAGE
                , null // Icon
                , null // Values for buttons
                , "Random button"    // Label default button
        );

    }

}

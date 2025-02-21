package content.POO.randomstuff.app;

import javax.swing.*;

public class PanesTUFF {

    public static void main ( String[] args ) {

        JOptionPane.showMessageDialog( null, "Welcome!" );

        JOptionPane.showMessageDialog( null, "How are you?" );

        JOptionPane.showOptionDialog(
                null
                , "Question?"        // Message
                , "Title"               // Title
                , JOptionPane.YES_NO_OPTION
                , JOptionPane.PLAIN_MESSAGE
                , null // Icon
                , null // Values for buttons
                , "Random button");    // Label default button

    }

}

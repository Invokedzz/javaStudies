package interfaces.test.application;

import interfaces.test.entities.*;

import interfaces.test.services.*;

public class ShadowRun {

    public static void main ( String[] args ) {

        User user = new User( "Mr.Duck", "1q23e" );

        DataLoader dataLoader = new DataLoader( user );

       if ( dataLoader.isUserValid() ) dataLoader.load();

    }

}

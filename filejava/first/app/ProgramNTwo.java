package filejava.first.app;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

import java.util.Locale;

public class ProgramNTwo {

    public static void main ( String[] args ) {

        Locale.setDefault( Locale.GERMAN );

        mainOperations ();

    }

    private static void mainOperations () {

        File file = new File ( "/Users/samunoinv/Documents/GitHub/javaStudies/filejava/first/app/secondfile" );

        Scanner init = null;

        try {

            init = new Scanner( file );

            if ( file.canRead() ) {

                while ( init.hasNextLine() ) {

                    System.out.println( init.nextLine() );

                }

                return;

            }

            System.out.println( "Hmmm, that's odd." );

        } catch ( IOException error ) {

            System.out.println( error.getMessage() );

        } finally {

            if ( init != null ) init.close();

        }

    }

}

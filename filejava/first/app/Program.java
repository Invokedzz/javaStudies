package filejava.first.app;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

    public static void main ( String[] args ) {

        File file = new File("/Users/samunoinv/Documents/GitHub/javaStudies/filejava/first/app/firstfile");

        Scanner init = null;

        try {

            init = new Scanner( file );

            while ( init.hasNextLine() ) {

                System.out.println( init.nextLine() );

            }

        } catch ( FileNotFoundException error ) {

            System.out.println( error.getMessage() );

        } finally {

            if ( init != null ) init.close();

        }

    }

}

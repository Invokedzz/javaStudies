package generics.set.thirdencounter.src.application;

import generics.set.thirdencounter.src.model.entities.UserEntry;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

import java.util.Set;

import java.io.*;

public class Program {

    public static void main ( String[] args ) {

        getUsers();

    }

    private static void getUsers () {

        Set < UserEntry > userEntrySet = new HashSet<>();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/generics/set/thirdencounter/src/model/files/users" );

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( file ))) {

            String line = bufferedReader.readLine();

            while ( line != null ) {

                String [] fields = line.split("\\s+");

                String username = fields[0];

                LocalDateTime date = LocalDateTime.parse( fields[1], dateTimeFormatter );

                userEntrySet.add( new UserEntry( username, date ));

                line = bufferedReader.readLine();

            }

            System.out.println( userEntrySet.size() );

        } catch ( IOException error ) {

            System.out.printf( "Error: %s", error.getMessage() );

        }


    }

}

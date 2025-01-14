package generics.map.thirdencounter.src.application;

import java.io.*;

import java.util.HashMap;

import java.util.Map;

public class Program {

    public static void main ( String[] args ) {

        timeToGetPeoplesMoney();

    }

    private static void timeToGetPeoplesMoney () {

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/generics/map/thirdencounter/src/files/pplmoney" );

        Map < String, Integer > mappingPeopleAccounts = new HashMap<>();

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( file ))) {

            String line = bufferedReader.readLine();

            while ( line != null ) {

                String [] fields = line.split( "," );

                String idiotName = fields[0];

                Integer idiotMoney = Integer.parseInt( fields[1] );

                mappingPeopleAccounts.put( idiotName, idiotMoney );

                if ( mappingPeopleAccounts.containsKey(idiotName) ) {

                    int moneyGatheredSoFar = mappingPeopleAccounts.get( idiotName ) + idiotMoney;

                    mappingPeopleAccounts.put( idiotName, moneyGatheredSoFar );

                }

                else mappingPeopleAccounts.put( idiotName, idiotMoney );

                line = bufferedReader.readLine();

            }

            for ( String key : mappingPeopleAccounts.keySet() ) {

                System.out.println( mappingPeopleAccounts.get( key ));

            }

        } catch ( IOException error ) {

            System.out.println( error.getMessage() );

        }

    }

}

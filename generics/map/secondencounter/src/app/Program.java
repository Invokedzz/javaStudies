package generics.map.secondencounter.src.app;

import generics.map.secondencounter.src.model.entities.Candidate;

import java.io.*;

import java.util.HashMap;

import java.util.Map;

public class Program {

    public static void main ( String[] args ) {

        countVotesAndCandidates();

    }

    private static void countVotesAndCandidates () {

        Map < String, Integer > candidateMap = new HashMap();

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/generics/map/secondencounter/src/model/files/candidatevotes" );

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( file ) )) {

            String line = bufferedReader.readLine();

            while ( line != null ) {

                String [] fields = line.split( "," );

                String candidateName = fields[0];

                Integer votes = Integer.parseInt( fields[1] );

                candidateMap.put( candidateName, votes );

                if ( candidateMap.containsKey(candidateName)) {

                    int totalVotes = candidateMap.get( candidateName );

                    int sum = totalVotes + votes;

                    candidateMap.put( candidateName, sum );

                }

                else candidateMap.put( candidateName, votes );

                line = bufferedReader.readLine();

            }

            for ( String key : candidateMap.keySet() ) {

                System.out.printf( "%s  %s", candidateMap.get( key ), key );

            }

        } catch ( IOException error ) {

            System.out.println( error.getMessage() );

        }

    }

}

package heritage.kingdom.application;

import heritage.kingdom.entities.heritage.abilities.AbilitiesCharacter;

import java.util.Scanner;

public class TestingMethods {

    public static void main ( String[] args ) {

        testLevelOfCharacter();

    }

    private static void testLevelOfCharacter () {

        Scanner init = new Scanner( System.in );

        AbilitiesCharacter abilitiesCharacter = new AbilitiesCharacter();

        int getLevel = abilitiesCharacter.levelValidation( init );

        System.out.println( getLevel );

    }

}

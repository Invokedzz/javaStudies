package heritage.kingdom.application;

import heritage.kingdom.entities.heritage.abilities.AbilitiesCharacter;

import java.util.Scanner;

public class TestingMethods {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        testLevelOfCharacter ( init );

        System.out.println( "##############################" );

   //     testAttackOfCharacter ( init );

        System.out.println( "##############################" );

    //    testDefenseOfCharacter ( init );

        System.out.println( "##############################" );

    }

    private static void testLevelOfCharacter ( Scanner init ) {

        AbilitiesCharacter character = new AbilitiesCharacter();

        character.validateAllMethods();

    }

}

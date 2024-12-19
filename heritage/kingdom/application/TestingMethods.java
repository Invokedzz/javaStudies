package heritage.kingdom.application;

import heritage.kingdom.entities.heritage.abilities.AbilitiesCharacter;

import java.util.Scanner;

public class TestingMethods {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        testLevelOfCharacter ( init );

        System.out.println( "##############################" );

        testAttackOfCharacter ( init );

        System.out.println( "##############################" );

        testDefenseOfCharacter ( init );

        System.out.println( "##############################" );

    }

    private static void testLevelOfCharacter ( Scanner init ) {

        AbilitiesCharacter abilitiesCharacter = new AbilitiesCharacter();

        int getLevel = abilitiesCharacter.levelValidation ( init );

        System.out.printf ( "Level: %s", getLevel );

    }

    private static void testAttackOfCharacter ( Scanner init ) {

        AbilitiesCharacter abilitiesCharacter = new AbilitiesCharacter();

        double getAttackPoints = abilitiesCharacter.attackValidation ( init );

        System.out.printf ( "Attack Points: %s", getAttackPoints );

    }

    private static void testDefenseOfCharacter ( Scanner init ) {

        AbilitiesCharacter character = new AbilitiesCharacter();

        double getDefensePoints = character.defensePoints ( init );

        System.out.printf ( "Defense Points: %s", getDefensePoints );

    }

}

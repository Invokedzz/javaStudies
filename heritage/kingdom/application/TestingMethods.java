package heritage.kingdom.application;

import heritage.kingdom.model.exceptions.AttackPointsException;

import heritage.kingdom.model.exceptions.InvalidLevelException;

import heritage.kingdom.model.inheritance.abilities.ValidateStats;

import heritage.kingdom.model.inheritance.abilities.ValidateUniqueAttributes;

import heritage.kingdom.model.inheritance.abilities.ValidateAbilities;

import heritage.kingdom.model.entities.Barbarian;

import heritage.kingdom.model.entities.Knight;

import heritage.kingdom.model.entities.Mage;

import heritage.kingdom.model.entities.Paladin;
import heritage.kingdom.model.inheritance.abilitiesenum.Abilities;

import java.util.Scanner;

public class TestingMethods {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

    //    testLevelOfCharacter ( init );

        System.out.println( "##############################" );

    //    testCharacterAttributes ( init );

        System.out.println( "##############################" );

        testCharactersAbilitiesKnight ( init );

    }

    private static void testLevelOfCharacter ( Scanner init ) {

        try {

            ValidateStats character = new ValidateStats();

            int level = character.levelValidation ( init );

            double attackPoints = character.attackValidation ( init );

            double defensePoints = character.defensePoints ( init );

            character.validateAllMethods( level, attackPoints, defensePoints );

        } catch ( InvalidLevelException | AttackPointsException error ) {

            System.out.printf( "Error message: %s", error.getMessage() );

        }

    }

    private static void testCharacterAttributes ( Scanner init ) {

        ValidateUniqueAttributes validateUniqueAttributes = new ValidateUniqueAttributes();

        double fury = validateUniqueAttributes.validateFury( init );

        double mana = validateUniqueAttributes.validateMana( init );

        double divineStrike = validateUniqueAttributes.validateDivineStrike( init );

        System.out.printf( "Fury: %s\nMana: %s\nDivine Strike: %s\n", fury, mana, divineStrike );

    }

    private static void testCharactersAbilitiesKnight ( Scanner init ) {

        ValidateAbilities validateAbilities = new ValidateAbilities();

        // Exceptions registered: IllegalArgumentException

        try {

            Abilities value = Abilities.valueOf( init.next() );

            Knight knight = new Knight( 1000.0, "Armor", "Sword", 100.0,
                    100.0, 100, "idk", "idk", value );

            if ( value.equals( Abilities.valueOf ( "DEFENSE_BOOST" ) ) ) {

                double getValue = validateAbilities.abilitiesKnight( knight );

                System.out.printf( "Defense Points: %s", getValue );

                return;

            }

            double getValue = validateAbilities.abilitiesKnight ( knight );

            System.out.printf( "Attack Points: %s", getValue );

        } catch ( IllegalArgumentException error ) {

            System.out.println( error.getMessage() );

        }

    }

}

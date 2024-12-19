package heritage.kingdom.application;

import heritage.kingdom.model.exceptions.AttackPointsException;

import heritage.kingdom.model.exceptions.InvalidLevelException;

import heritage.kingdom.model.inheritance.abilities.ValidateStats;

import heritage.kingdom.model.inheritance.abilities.ValidateUniqueAttributes;

import java.util.Scanner;

public class TestingMethods {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        testLevelOfCharacter ( init );

        System.out.println( "##############################" );

        testCharacterAttributes ( init );

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

}

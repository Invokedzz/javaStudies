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

        ValidateStats validateStats = new ValidateStats();

        int level = validateStats.levelValidation( init );

        double attackPoints = validateStats.attackValidation( init );

        double defensePoints = validateStats.defensePoints( init );

        validateStats.validateAllMethods( level, attackPoints, defensePoints );

        try {

            Abilities value = Abilities.valueOf ( init.next() );

            Knight knight = new Knight( 1000.0, "Armor", "Sword", attackPoints,
                    defensePoints, level, "idk", "idk", value );

            if ( value.equals( Abilities.valueOf ( "DEFENSE_BOOST" ) ) ) {

                double getBonusStats = validateAbilities.abilitiesKnight( knight );

                double attackDeclaration = knight.declareAttack();

                double blockAttack = knight.blockAttack() + getBonusStats;

                double lifePoints = knight.calculateLifePoints();

                System.out.printf( "Attack: %s\nDefense: %s\nLife Points: %s\n", attackDeclaration, blockAttack, lifePoints );

                return;

            }

            double getBonusStats = validateAbilities.abilitiesKnight( knight );

            double attackDeclaration = knight.declareAttack() + getBonusStats;

            double blockAttack = knight.blockAttack();

            double lifePoints = knight.calculateLifePoints();

            System.out.printf( "Attack: %s\nDefense: %s\nLife Points: %s\n", attackDeclaration, blockAttack, lifePoints );

        } catch ( IllegalArgumentException error ) {

            System.out.println( error.getMessage() );

        }

    }

    private static void testCharactersAbilitiesBarbarian ( Scanner init ) {

    }

    private static void testCharactersAbilitiesMage ( Scanner init ) {

    }

    private static void testCharactersAbilitiesPaladin ( Scanner init ) {
        
    }

}

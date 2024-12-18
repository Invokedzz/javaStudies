package heritage.kingdom.application;

import heritage.kingdom.entities.main.Barbarian;

//import heritage.kingdom.entities.main.Mage;

import heritage.kingdom.entities.main.Paladin;

import heritage.kingdom.entities.main.Knight;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class KingdomApp {

    public static void main ( String[] args ) {

        createDuel();

        System.out.println( "##############################################\n" );

        testBarbarian();

    }

    private static void createDuel () {

        Knight knight = new Knight( 1000.0, "Dark Armor", "Sword", 100.0, 200.0,
                1000, "idk", "idk", 34, "pendulum", Abilities.STRENGTH_BOOST );

        double getAttackPoints = knight.declareAttack();

        double getDefensePoints = knight.blockAttack();

        double getLifePoints = knight.calculateLifePoints();

        double getResolution = knight.resolveAttackImpact();

        System.out.printf( "%s\nAtk: %s\nDef: %s\nLife Points: %s\n", knight, getAttackPoints, getDefensePoints, getLifePoints );

        System.out.printf( "Resolution damage: %s\n", getResolution );

        boolean isHeAlive = knight.isAlive();

        System.out.println( isHeAlive );

    }

    private static void testBarbarian () {

        Barbarian barbarian = new Barbarian( 1000.0, "Armor", "Sword",
                100.0, 100.0, 1000, "idk",
                "idk", Abilities.COOKING_BOOST, 100.0  );

        double getAttackPoints = barbarian.declareAttack();

        double getDefensePoints = barbarian.blockAttack();

        double getLifePoints = barbarian.calculateLifePoints();

        double getResolution = barbarian.resolveAttackImpact();

        System.out.printf( "%s\nAtk: %s\nDef: %s\nLife Points: %s\n", barbarian, getAttackPoints, getDefensePoints, getLifePoints );

        System.out.printf( "Resolution damage: %s\n", getResolution );

        boolean isHeAlive = barbarian.isAlive();

        System.out.println( isHeAlive );

    }

    private static void testPaladin () {

    }

    private static void testMage () {

    }

   /* private static void userOptionTowardsTheirCharacter ( char userOption ) {

        switch ( userOption ) {

            case 'm' | 'M':

                System.out.println( "Ask him a bunch of stuff" );

                break;

            case 'b' | 'B':

            case 'k' | 'K':

            case 'p' | 'P':

            default:

                System.out.println( "Invalid bla bla" );

                break;

        }

    } */

}

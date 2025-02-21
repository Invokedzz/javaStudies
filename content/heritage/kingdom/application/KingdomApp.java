package content.heritage.kingdom.application;

import content.heritage.kingdom.model.entities.Barbarian;

import content.heritage.kingdom.model.entities.Mage;

import content.heritage.kingdom.model.entities.Paladin;

import content.heritage.kingdom.model.entities.Knight;

import content.heritage.kingdom.model.inheritance.abilitiesenum.Abilities;

public class KingdomApp {

    public static void main ( String[] args ) {

        createDuel();

        System.out.println( "##############################################\n" );

        testBarbarian();

        System.out.println( "##############################################\n" );

        testPaladin();

        System.out.println( "##############################################\n" );

        testMage();

    }

    private static void createDuel () {

        Knight knight = new Knight( 1000.0, "Dark Armor", "Sword", 100.0, 200.0,
                100, "idk", "idk", 34, "pendulum", Abilities.STRENGTH_BOOST );

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
                100.0, 100.0, 100, "idk",
                "idk", Abilities.WRATH_BOOST, 100.0  );

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

        Paladin paladin = new Paladin( 1000.0, "Armor", "Sword",
                100.0, 100.0, 100, "idk",
                "idk", Abilities.HEALING_BOOST, 100.0  );

        double getAttackPoints = paladin.declareAttack();

        double getDefensePoints = paladin.blockAttack();

        double getLifePoints = paladin.calculateLifePoints();

        double getResolution = paladin.resolveAttackImpact();

        System.out.printf( "%s\nAtk: %s\nDef: %s\nLife Points: %s\n", paladin, getAttackPoints, getDefensePoints, getLifePoints );

        System.out.printf( "Resolution damage: %s\n", getResolution );

        boolean isHeAlive = paladin.isAlive();

        System.out.println( isHeAlive );

    }

    private static void testMage () {

        Mage mage = new Mage( 1000.0, "Armor", "Sword",
                100.0, 100.0, 100, "idk",
                "idk", Abilities.MAGICAL_BOOST, 100.0  );

        double getAttackPoints = mage.declareAttack();

        double getDefensePoints = mage.blockAttack();

        double getLifePoints = mage.calculateLifePoints();

        double getResolution = mage.resolveAttackImpact();

        System.out.printf( "%s\nAtk: %s\nDef: %s\nLife Points: %s\n", mage, getAttackPoints, getDefensePoints, getLifePoints );

        System.out.printf( "Resolution damage: %s\n", getResolution );

        boolean isHeAlive = mage.isAlive();

        System.out.println( isHeAlive );

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

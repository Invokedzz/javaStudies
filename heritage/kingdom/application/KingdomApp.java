package heritage.kingdom.application;

import heritage.kingdom.entities.heritage.Human;

import heritage.kingdom.entities.main.Barbarian;

import heritage.kingdom.entities.main.Mage;

import heritage.kingdom.entities.main.Paladin;

import heritage.kingdom.entities.main.Knight;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class KingdomApp {

    public static void main ( String[] args ) {

        createDuel();

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

    private static void testingOtherClasses () {

       // Barbarian barbarian = new Barbarian();

        // double getAttackPoints = barbarian.declareLifePoints();

        // double getDefensePoints = barbarian.declareAttack();

    }

}

package heritage.kingdom.application;

// import heritage.kingdom.entities.heritage.Human;

import heritage.kingdom.entities.main.Barbarian;
import heritage.kingdom.entities.main.Knight;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

public class KingdomApp {

    public static void main ( String[] args ) {

        createDuel();

    }

    private static void createDuel () {

        Knight knight = new Knight( 1000.0, "Dark Armor", "Sword", 100.0, 200.0, 100, "idk",
                "idk", 34, "pendulum", Abilities.STRENGTH_BOOST );

        double getAttackPoints = knight.declareAttack();

        double getDefensePoints = knight.blockAttack();

        double getLifePoints = knight.declareLifePoints();

        System.out.printf( "%s\nAtk: %s\nDef: %s\nLife Points: %s", knight, getAttackPoints, getDefensePoints, getLifePoints );

    }

    private static void testingOtherClasses () {

       // Barbarian barbarian = new Barbarian();

        // double getAttackPoints = barbarian.declareLifePoints();

        // double getDefensePoints = barbarian.declareAttack();

    }

}

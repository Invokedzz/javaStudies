package heritage.kingdom.application;

import heritage.kingdom.entities.heritage.Human;

import heritage.kingdom.entities.main.Knight;

import heritage.kingdom.entities.heritage.abilitiesenum.Abilities;

public class KingdomApp {

    public static void main ( String[] args ) {

        createDuel();

    }

    private static void createDuel () {

        Knight knight = new Knight( "Dark Armor", "Sword", 100.0, 50.0, 1000, 1000,
                "idk", "an honest person LOL", 30, "a pendulum", Abilities.STRENGTH_BOOST );

        double getAttackPoints = knight.declareAttack();

        double getDefensePoints = knight.blockAttack();

        System.out.printf( "%s\n%s\n%s", knight, getAttackPoints, getDefensePoints );

    }

}

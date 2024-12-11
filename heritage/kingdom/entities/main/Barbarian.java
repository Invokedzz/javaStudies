package heritage.kingdom.entities.main;

public class Barbarian extends Knight {

    // barbarian is pure gas. great life points and attack damage.

    // armor ( String ), weapon ( String ),
    // attackPoints ( double ), defensePoints ( double )

    public Barbarian () {}

    public Barbarian ( double lifePoints, String armor, String weapon, double attackPoints, double defensePoints ) {

        super ( lifePoints, armor, weapon, attackPoints, defensePoints );

    }

}

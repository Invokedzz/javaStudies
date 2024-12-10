package heritage.kingdom.entities.main;

import heritage.kingdom.entities.heritage.Human;
import heritage.kingdom.entities.heritage.abilities.Abilities;

public class Knight extends Human {

    // armor ( String ), weapon ( String ),
    // attackPoints ( double ), defensePoints ( double )

    // feelings ( String ), appearance ( String )
    // age ( int ), accessory ( String ), specialAbility ( String )

    private String armor;

    private String weapon;

    private double attackPoints;

    private double defensePoints;

    public Knight ( String armor, String weapon, double attackPoints, double defensePoints, String feelings,
                    String appearance, int age, String accessory, Abilities specialAbility ) {

        super ( feelings, appearance, age, accessory, specialAbility );

        this.armor = armor;

        this.weapon = weapon;

        this.attackPoints = attackPoints;

        this.defensePoints = defensePoints;

    }

}

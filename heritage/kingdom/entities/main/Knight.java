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
                    int level, String appearance, int age, String accessory, Abilities specialAbility ) {

        super ( level, appearance, feelings, age, accessory, specialAbility );

        this.armor = armor;

        this.weapon = weapon;

        this.attackPoints = attackPoints;

        this.defensePoints = defensePoints;

    }

    public double declareAttack () {



    }

    public double blockAttack () {



    }

    public void setAttackPoints ( double attackPoints ) {

        // attack points, min: 5, max: 100



    }

    public void setDefensePoints ( double defensePoints ) {



    }

    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( " Armor: " ).append( armor )
                .append( " Weapon: " ).append( weapon )
                .append( " Attack Points: " ).append( attackPoints )
                .append( " Defense Points: " ).append( defensePoints );

        return sb.toString();

    }

}

package heritage.kingdom.model.inheritance.abilities;

import heritage.kingdom.model.entities.Knight;

import heritage.kingdom.model.entities.Barbarian;

import heritage.kingdom.model.entities.Mage;

import heritage.kingdom.model.entities.Paladin;

import heritage.kingdom.model.inheritance.abilitiesenum.Abilities;

// MAGICAL_BOOST, STRENGTH_BOOST, WRATH_BOOST,

// DEFENSE_BOOST, HEALING_BOOST, COOKING_BOOST, FISHING_BOOST

public class ValidateAbilities {

    public double abilitiesKnight ( Knight knight ) {

        if ( knight.getSpecialAbility().equals ( Abilities.STRENGTH_BOOST ) ) return knight.getAttackPoints() + 50.0;

        if ( knight.getSpecialAbility().equals ( Abilities.DEFENSE_BOOST ) ) return knight.getDefensePoints() + 30;

        return knight.getAttackPoints();

    }

    public double abilitiesBarbarian ( Barbarian barbarian ) {

    }

    public double abilitiesMage ( Mage mage ) {

    }

    public double abilitiesPaladin ( Paladin paladin ) {
        
    }

}

package heritage.kingdom.model.inheritance.abilities;

import heritage.kingdom.model.entities.Knight;

import heritage.kingdom.model.entities.Barbarian;

import heritage.kingdom.model.entities.Mage;

import heritage.kingdom.model.entities.Paladin;

import heritage.kingdom.model.exceptions.InvalidAbilityInput;
import heritage.kingdom.model.inheritance.abilitiesenum.Abilities;

// MAGICAL_BOOST, STRENGTH_BOOST, WRATH_BOOST,

// DEFENSE_BOOST, HEALING_BOOST

public class ValidateAbilities {

    public double abilitiesKnight ( Knight knight ) {

        if ( knight.getSpecialAbility().equals ( Abilities.STRENGTH_BOOST ) ) return knight.getAttackPoints() + 50.0;

        if ( knight.getSpecialAbility().equals ( Abilities.DEFENSE_BOOST ) ) return knight.getDefensePoints() + 30.0;

        if ( knight.getSpecialAbility().equals( Abilities.NONE ) ) return knight.getAttackPoints();

        throw new InvalidAbilityInput( "Enter a valid ability! (STRENGTH_BOOST, DEFENSE_BOOST or NONE)" );
    }

    public double abilitiesBarbarian ( Barbarian barbarian ) {

        if ( barbarian.getSpecialAbility().equals ( Abilities.WRATH_BOOST ) ) return barbarian.getFury() + 100.0;

        if ( barbarian.getSpecialAbility().equals ( Abilities.STRENGTH_BOOST ) ) return barbarian.getAttackPoints() + 50.0;

        if ( barbarian.getSpecialAbility().equals ( Abilities.NONE ) ) return barbarian.getAttackPoints();

        throw new InvalidAbilityInput( "Enter a valid ability! (WRATH_BOOST, STRENGTH_BOOST or NONE)" );

    }

    public double abilitiesMage ( Mage mage ) {

        if ( mage.getSpecialAbility().equals ( Abilities.MAGICAL_BOOST ) ) return mage.getAttackPoints() + mage.getMana();

        if ( mage.getSpecialAbility().equals ( Abilities.NONE ) ) return mage.getAttackPoints();

        throw new InvalidAbilityInput( "Enter a valid ability! (MAGICAL_BOOST or NONE)" );

    }

    public double abilitiesPaladin ( Paladin paladin ) {

        if ( paladin.getSpecialAbility().equals ( Abilities.DEFENSE_BOOST ) ) return paladin.getDefensePoints() + 50.0;

        if ( paladin.getSpecialAbility().equals ( Abilities.HEALING_BOOST ) ) return paladin.getAttackPoints() + paladin.getDivineStrike();

        if ( paladin.getSpecialAbility().equals( Abilities.NONE ) ) return paladin.getAttackPoints();

        throw new InvalidAbilityInput( "Enter a valid ability! (DEFENSE_BOOST, HEALING_BOOST or NONE)" );

    }

}

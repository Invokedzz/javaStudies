package heritage.kingdom.entities.heritage.abilitiesenum;

public enum Abilities {

    MAGICAL_BOOST, // Mage, Necromancer -> extends Human

    STRENGTH_BOOST, // Knight, Samurai, Barbarian -> extends Human

    DEFENSE_BOOST, // Tank, Paladin -> extends Human

    COOKING_BOOST, // General

    FISHING_BOOST, // General

    // For the Knight class,
    // we're going to use the STRENGTH_BOOST AND DEFENSE_BOOST

    // STRENGTH_BOOST: raises the atk by 50% for 3 turns;
    // DEFENSE_BOOST: the user can't take damage for 2 turns,
    // but his atk drops by 80%.

}

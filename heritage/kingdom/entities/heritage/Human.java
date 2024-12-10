package heritage.kingdom.entities.heritage;

import heritage.kingdom.entities.heritage.abilities.Abilities;

public class Human {

    // feelings ( String ), appearance ( String )
    // age ( int ), accessory ( String ), specialAbility ( String )

    private String appearance;

    private String feelings;

    private int age;

    private String accessory;

    private Abilities specialAbility;

    public Human () {}

    public Human ( String appearance, String feelings, int age, String accessory, Abilities specialAbility ) {

        this.appearance = appearance;

        this.feelings = feelings;

        this.age = age;

        this.accessory = accessory;

        this.specialAbility = specialAbility;

    }

    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append("Appearance: ").append( appearance )
                .append( " Feelings: " ).append( feelings )
                .append( " Age: " ).append( age )
                .append( " Accessory: " ).append( accessory )
                .append( " Abilities: " ).append( specialAbility );

        return sb.toString();

    }

}

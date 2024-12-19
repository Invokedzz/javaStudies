package heritage.kingdom.entities.heritage.abilities;

import java.util.Scanner;

// fury (double), mana (double), divineStrike (double) -> Barbarian, Mage, Paladin

public class validateUniqueAttributes {

    private boolean hasDouble ( Scanner init ) {

        return init.hasNextDouble();

    }

    public double validateFury ( Scanner furyPoints ) {

        double validFury;

        while ( !hasDouble ( furyPoints ) ) {

            System.out.println( "Enter a valid number for fury stat!" );

            furyPoints.next();

        }

        validFury = furyPoints.nextDouble();

        while ( validFury < 0 || validFury > 100 ) {

            System.out.println( "Enter a valid fury value! (max: 100 / min: 0)" );

            while ( !hasDouble( furyPoints ) ) {

                System.out.println( "Enter a double number for fury stat!" );

                furyPoints.next();

            }

            validFury = furyPoints.nextDouble();

        }

        return validFury;

    }

    public double validateMana ( Scanner init ) {

    }

    public double validateDivineStrike ( Scanner init ) {

    }

}

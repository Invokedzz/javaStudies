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

    public double validateMana ( Scanner manaPoints ) {

        double validMana;

        while ( !hasDouble ( manaPoints ) ) {

            System.out.println( "Enter a valid number for mana stat!" );

            manaPoints.next();

        }

        validMana = manaPoints.nextDouble();

        while ( validMana < 0 || validMana > 100 ) {

            System.out.println( "Enter a valid mana value! (max: 100 / min: 0)" );

            while ( !hasDouble( manaPoints ) ) {

                System.out.println( "Enter a double number for mana stat!" );

                manaPoints.next();

            }

            validMana = manaPoints.nextDouble();

        }

        return validMana;

    }

    public double validateDivineStrike ( Scanner divineStrikePoints ) {

        double validDivineStrike;

        while ( !hasDouble ( divineStrikePoints ) ) {

            System.out.println( "Enter a valid number for fury stat!" );

            divineStrikePoints.next();

        }

        validDivineStrike = divineStrikePoints.nextDouble();

        while ( validDivineStrike < 0 || validDivineStrike > 100 ) {

            System.out.println( "Enter a valid fury value! (max: 100 / min: 0)" );

            while ( !hasDouble( divineStrikePoints ) ) {

                System.out.println( "Enter a double number for fury stat!" );

                divineStrikePoints.next();

            }

            validDivineStrike = divineStrikePoints.nextDouble();

        }

        return validDivineStrike;

    }

}

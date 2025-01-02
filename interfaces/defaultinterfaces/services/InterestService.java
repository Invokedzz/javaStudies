package interfaces.defaultinterfaces.services;

import java.security.InvalidParameterException;

public interface InterestService {

    double interestRate ();

    default double payment ( double amount, int months ) {

        if ( months < 1 ) throw new InvalidParameterException();

        return amount * Math.pow( 1 + interestRate() / 100, months );

    }

}

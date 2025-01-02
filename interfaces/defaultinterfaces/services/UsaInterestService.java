package interfaces.defaultinterfaces.services;

public class UsaInterestService implements InterestService {

    private double interestRate;

    public UsaInterestService ( double interestRate ) {

        this.interestRate = interestRate;

    }

    @Override
    public double interestRate() {

        return interestRate;

    }

}

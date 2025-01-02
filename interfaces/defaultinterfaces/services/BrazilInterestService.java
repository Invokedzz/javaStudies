package interfaces.defaultinterfaces.services;

public class BrazilInterestService implements InterestService {

    private double interestRate;

    public BrazilInterestService ( double interestRate ) {

        this.interestRate = interestRate;

    }

    @Override
    public double interestRate() {

        return interestRate;

    }


}

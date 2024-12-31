package interfaces.srcnumtwo.model.services;

public class PaypalService implements OnlinePaymentService {

    private static final double SIMPLE_INTEREST = 0.01;

    private static final double PAYMENT_RATE = 0.02;

    @Override
    public Double paymentFee ( double amount ) {

        return amount * PAYMENT_RATE;

    }

    @Override
    public Double interest ( double amount, int months ) {

        return amount * months * SIMPLE_INTEREST;

    }


}

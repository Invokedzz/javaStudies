package practice.src.model.services;

public class PaypalService implements OnlinePaymentService {

    private static final double SIMPLE_INTEREST = 0.01;

    private static final double PAYMENT_TAX = 0.02;

    @Override
    public Double paymentFee ( Double amount ) { // taxa de pagamento

        return amount * PAYMENT_TAX;

    }

    @Override
    public Double interest ( Double amount, Integer months ) { // juro

        return amount * months * SIMPLE_INTEREST;

    }


}

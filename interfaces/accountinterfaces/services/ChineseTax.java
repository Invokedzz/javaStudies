package interfaces.accountinterfaces.services;

public class ChineseTax implements ServiceForTaxes {

    // 13%

    @Override
    public Double calculateTax ( Double amount ) {

        return amount * 0.13;

    }


}

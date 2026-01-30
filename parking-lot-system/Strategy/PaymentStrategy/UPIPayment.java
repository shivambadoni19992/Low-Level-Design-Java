package Strategy.PaymentStrategy;

import Enums.PaymentType;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.UPI;
    }
}

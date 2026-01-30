package Strategy.PaymentStrategy;

import Enums.PaymentType;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Cash");
    }

    @Override
    public PaymentType getPaymentType() {
        return PaymentType.CASH;
    }
}

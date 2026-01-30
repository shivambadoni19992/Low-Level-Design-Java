package Factory;

import Strategy.PaymentStrategy.PaymentStrategy;
import Strategy.PaymentStrategy.CashPayment;
import Strategy.PaymentStrategy.UPIPayment;

public class PaymentFactory {

    public static PaymentStrategy getPaymentStrategy(String paymentType) {
        switch (paymentType) {
            case "CASH":
                return new CashPayment();
            case "UPI":
                return new UPIPayment();
            default:
                throw new IllegalArgumentException("Invalid payment type");
        }
    }
}

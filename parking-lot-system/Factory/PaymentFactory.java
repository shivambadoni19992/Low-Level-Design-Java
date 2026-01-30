package Factory;

import Strategy.PaymentStrategy.PaymentStrategy;
import Strategy.PaymentStrategy.CashPayment;
import Strategy.PaymentStrategy.UPIPayment;
import Enums.PaymentType;

public class PaymentFactory {

    public static PaymentStrategy getPaymentStrategy(PaymentType paymentType) {
        switch (paymentType) {
            case PaymentType.CASH:
                return new CashPayment();
            case PaymentType.UPI:
                return new UPIPayment();
            default:
                throw new IllegalArgumentException("Invalid payment type");
        }
    }
}

package Strategy.PaymentStrategy;

import Enums.PaymentType;

public interface PaymentStrategy {
    public void pay(int amount);

    public PaymentType getPaymentType();
}

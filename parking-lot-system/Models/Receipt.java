package Models;

import Enums.PaymentType;

public class Receipt {
    private String receiptNumber;
    private Ticket ticket;
    private double amount;
    private PaymentType paymentMode;
    private String paymentStatus;
    private String exitTime;

    public Receipt(Ticket ticket, double amount, PaymentType paymentMode, String paymentStatus,
            String exitTime) {

        this.ticket = ticket;
        this.receiptNumber = generateReceiptNumber();
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.exitTime = exitTime;
    }

    private String generateReceiptNumber() {
        return "RECEIPT-" + ticket.getTicketNumber();
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentType getPaymentMode() {
        return paymentMode;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getExitTime() {
        return exitTime;
    }

}

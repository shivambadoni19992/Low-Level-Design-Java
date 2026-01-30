package Models;

public class Receipt {
    private String receiptNumber;
    private Ticket ticket;
    private double amount;
    private String paymentMode;
    private String paymentStatus;
    private String exitTime;

    public Receipt(String receiptNumber, Ticket ticket, double amount, String paymentMode, String paymentStatus,
            String exitTime) {
        this.receiptNumber = receiptNumber;
        this.ticket = ticket;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.exitTime = exitTime;
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

    public String getPaymentMode() {
        return paymentMode;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getExitTime() {
        return exitTime;
    }

}

package Controller;

import Service.ExitService;
import Strategy.PaymentStrategy.PaymentStrategy;
import Models.Receipt;
import Models.Ticket;

public class ExitController {

    private final ExitService exitService;

    public ExitController(ExitService exitService) {
        this.exitService = exitService;
    }

    public Receipt exitVehicle(Ticket ticket, PaymentStrategy paymentStrategy) {
        return exitService.exitVehicle(ticket, paymentStrategy);
    }

}

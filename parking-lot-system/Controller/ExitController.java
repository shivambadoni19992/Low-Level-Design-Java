package Controller;

import Service.ExitService;
import Strategy.PricingStrtegy.HourlyRateStrategy;

import Models.Receipt;
import Models.Ticket;
import Enums.PaymentType;

public class ExitController {

    ExitService exitService;

    public ExitController() {
        this.exitService = new ExitService(new HourlyRateStrategy());
    }

    public Receipt exitVehicle(Ticket ticket, PaymentType paymentType) {
        return exitService.exitVehicle(ticket, paymentType);
    }

}

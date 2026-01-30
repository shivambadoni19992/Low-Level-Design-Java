import Controller.AdminController;
import Controller.EntryController;
import Controller.ExitController;
import Enums.PaymentType;
import Enums.SpotType;
import Factory.PaymentFactory;
import Models.ParkingSpot;
import Models.Receipt;
import Models.Ticket;
import Models.Vehicle.Bike;
import Models.Vehicle.Car;
import Service.AdminService;
import Service.EntryService;
import Service.ExitService;
import Models.ParkingFloor;
import Repository.AdminRepository;
import Repository.EntryRepository;
import Strategy.PricingStrtegy.HourlyRateStrategy;
import Strategy.PricingStrtegy.PricingStrategy;
import Strategy.SpotAllocationStrategy.NearestSpotStrategy;
import Strategy.SpotAllocationStrategy.SpotAllocationStrategy;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    public static void main(String[] args) {

        AdminRepository adminRepository = new AdminRepository();
        EntryRepository entryRepository = new EntryRepository();
        PricingStrategy pricingStrategy = new HourlyRateStrategy();

        AdminService adminService = new AdminService(adminRepository);

        AdminController adminController = new AdminController(adminService);

        List<ParkingFloor> parkingFloors = new ArrayList<>();

        int floors = 3;

        for (int i = 0; i < floors; i++) {
            adminController.createParkingFloor(i);
            ParkingFloor parkingFloor = adminController.getParkingFloor();
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(1, SpotType.SMALL));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(2, SpotType.MEDIUM));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(3, SpotType.LARGE));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(4, SpotType.SMALL));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(5, SpotType.MEDIUM));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(6, SpotType.LARGE));
            parkingFloors.add(parkingFloor);
        }
        SpotAllocationStrategy spotAllocationStrategy = new NearestSpotStrategy(parkingFloors);

        EntryService entryService = new EntryService(entryRepository, spotAllocationStrategy);
        ExitService exitService = new ExitService(pricingStrategy);

        EntryController entryController = new EntryController(entryService);
        ExitController exitController = new ExitController(exitService);

        System.out.println(parkingFloors.size());

        Ticket ticket = entryController.enterVehicle(new Bike("KA-01-HH-1234"), parkingFloors);
        Ticket ticket2 = entryController.enterVehicle(new Bike("KA-01-HH-1235"), parkingFloors);

        Receipt receipt = exitController.exitVehicle(ticket, PaymentFactory.getPaymentStrategy(PaymentType.CASH));

        Ticket ticket3 = entryController.enterVehicle(new Bike("KA-01-HH-1236"), parkingFloors);

        Ticket ticket4 = entryController.enterVehicle(new Car("KA-01-HH-1237"), parkingFloors);

        System.out.println(ticket.getTicketNumber());
        System.out.println(ticket2.getTicketNumber());
        System.out.println(ticket3.getTicketNumber());
        System.out.println(ticket4.getTicketNumber());

        Receipt receipt2 = exitController.exitVehicle(ticket2, PaymentFactory.getPaymentStrategy(PaymentType.UPI));
        Receipt receipt3 = exitController.exitVehicle(ticket3, PaymentFactory.getPaymentStrategy(PaymentType.CASH));
        Receipt receipt4 = exitController.exitVehicle(ticket4, PaymentFactory.getPaymentStrategy(PaymentType.CASH));

        System.out.println(receipt.getReceiptNumber());
        System.out.println(receipt2.getReceiptNumber());
        System.out.println(receipt3.getReceiptNumber());
        System.out.println(receipt4.getReceiptNumber());

    }

}

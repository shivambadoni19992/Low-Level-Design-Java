import Controller.AdminController;
import Controller.EntryController;
import Controller.ExitController;
import Enums.PaymentType;
import Enums.SpotType;
import Models.ParkingSpot;
import Models.Receipt;
import Models.Ticket;
import Models.Vehicle.Bike;
import Models.Vehicle.Car;
import Models.ParkingFloor;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    public static void main(String[] args) {
        AdminController adminController = new AdminController();
        EntryController entryController = new EntryController();
        ExitController exitController = new ExitController();

        List<ParkingFloor> parkingFloors = new ArrayList<>();

        int floors = 3;

        for (int i = 0; i < floors; i++) {
            adminController.createParkingFloor(i);
            ParkingFloor parkingFloor = adminController.getParkingFloors();
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(1, SpotType.SMALL));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(2, SpotType.MEDIUM));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(3, SpotType.LARGE));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(4, SpotType.SMALL));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(5, SpotType.MEDIUM));
            adminController.addParkingSpot(parkingFloor, new ParkingSpot(6, SpotType.LARGE));
            parkingFloors.add(parkingFloor);
        }

        System.out.println(parkingFloors.size());

        Ticket ticket = entryController.enterVehicle(new Bike("KA-01-HH-1234"), parkingFloors);
        Ticket ticket2 = entryController.enterVehicle(new Bike("KA-01-HH-1235"), parkingFloors);

        Receipt receipt = exitController.exitVehicle(ticket, PaymentType.CASH);

        Ticket ticket3 = entryController.enterVehicle(new Bike("KA-01-HH-1236"), parkingFloors);

        Ticket ticket4 = entryController.enterVehicle(new Car("KA-01-HH-1237"), parkingFloors);

        System.out.println(ticket.getTicketNumber());
        System.out.println(ticket2.getTicketNumber());
        System.out.println(ticket3.getTicketNumber());
        System.out.println(ticket4.getTicketNumber());

        Receipt receipt2 = exitController.exitVehicle(ticket2, PaymentType.UPI);
        Receipt receipt3 = exitController.exitVehicle(ticket3, PaymentType.CASH);
        Receipt receipt4 = exitController.exitVehicle(ticket4, PaymentType.CASH);

        System.out.println(receipt.getReceiptNumber());
        System.out.println(receipt2.getReceiptNumber());
        System.out.println(receipt3.getReceiptNumber());
        System.out.println(receipt4.getReceiptNumber());

    }

}

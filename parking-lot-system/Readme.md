🚗 Parking Lot System – Low Level Design (Java)

This project implements a Parking Lot System using Low Level Design (LLD) principles in Java, focusing on clean architecture, extensibility, and real-world parking workflows.

It is designed to demonstrate OOP concepts, SOLID principles, and design patterns commonly expected in backend / system design interviews.

📌 Features

Multi-floor parking lot
Supports multiple vehicle types (Bike, Car)
Different parking spot types (SMALL, MEDIUM, LARGE)
Entry & Exit flow with ticketing
Pricing strategy (hourly rate)
Multiple payment methods (Cash, UPI)
Admin operations (add floors, add/remove spots)
Clean separation of layers (Controller, Service, Repository)

🧠 Design Principles Used
SOLID Principles
Separation of Concerns
Manual Dependency Injection
Extensible & Testable Design

🏗️ Architecture Overview
Controller Layer
Service Layer
Repository Layer
Domain Models

🎯 Design Patterns Used
1️⃣ Strategy Pattern
Used for:
Spot allocation strategy
Pricing calculation
Payment behavior
SpotAllocationStrategy
PricingStrategy
PaymentStrategy

This allows easy extension without modifying existing logic.

2️⃣ Factory Pattern
Used for creating payment strategies:
PaymentFactory.getPaymentStrategy(PaymentType.CASH);

Keeps object creation centralized and clean.

3️⃣ Dependency Injection (Manual)
All dependencies are created in the composition root (main), avoiding tight coupling.

main()
 ├── Repository
 ├── Strategy
 ├── Service    
 └── Controller

This makes the system:
Testable
Loosely coupled
Framework-ready (Spring Boot compatible)

🚦 Parking Flow
🔹 Entry Flow
Vehicle enters parking lot
Spot allocation strategy selects best spot
Vehicle is assigned a spot
Ticket is generated

🔹 Exit Flow
Pricing strategy calculates parking fee
Payment is processed
Parking spot is freed
Receipt is generated

👨‍💼 Admin Capabilities
Create parking floors
Add parking spots
Remove parking spots
(Admin operations are assumed to be authenticated for simplicity.)

🧪 Assumptions
In-memory storage (no database)
Single-threaded execution (no concurrency handling)
Payment always succeeds (failure handling can be added)
No authentication layer (focus is on LLD)

🛠️ How to Run
Clone the repository
Open in any Java IDE
Run the ParkingLot class
javac ParkingLot.java
java ParkingLot

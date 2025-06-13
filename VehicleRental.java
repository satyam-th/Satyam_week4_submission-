class Vehicle{
    private String numberPlate;
    private double baseRate;
  
    public Vehicle(String numberPlate, double baseRate) {
        this.numberPlate = numberPlate;
        this.baseRate = baseRate;
    }

    public double calculateRental(int days) {
        return baseRate * days;
    }
}
class car extends Vehicle {

    public car(String numberPlate, double baseRate) {
        super(numberPlate, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return super.calculateRental(days);
    }
}
class Truck extends Vehicle {
    private double loadfee;

    public Truck(String numberPlate, double baseRate, double loadfee) {
        super(numberPlate, baseRate);
        this.loadfee = loadfee;
    }

    @Override
    public double calculateRental(int days) {
        return super.calculateRental(days) + loadfee;
    }
}
class Bike extends Vehicle {

    public Bike(String numberPlate, double baseRate) {
        super(numberPlate, baseRate);
    }

    @Override
    public double calculateRental(int days) {
        return super.calculateRental(1); // Assuming bike rental is calculated for one day
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new car("bagmati-01 ba 1922", 100);
        vehicles[1] = new Truck("bagmati-02 ja 123", 150, 50);
        vehicles[2] = new Bike("01 ba 123", 30);

        for (Vehicle vehicle : vehicles) {
                       //.get.class().getname() function will give  .get.class() will return the class and .getName() will return the name of the class
            System.out.println("Vehicle Number Plate: " + vehicle.getClass().getName() + " Rental for 5 days: " + vehicle.calculateRental(5));// Assuming rental for 5 days
        }
    }
    
}

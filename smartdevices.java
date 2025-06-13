// SmartDevice hierarchy
//  i got error while i put public to superclass and subclass so i removed public from superclass and subclass
// i have aksed with ai what is the error  and it said that @override is invalid because the 'o' is lowercase. The correct one is @Override
// but also i am getting error

class SmartDevice {
    String brand;
    String model;

    public SmartDevice() {
        this.brand = "Unknown";
        this.model = "Unknown";
    }

    public void turnOff() {
        System.out.println("Turning off " + brand + " " + model);
    }

    public void turnOn() {
        System.out.println("Turning on " + brand + " " + model);
    }
}

class Smartphone extends SmartDevice {
    String os;
    int ram;

    public Smartphone(String brand, String model, String os, int ram) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.ram = ram;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on smartphone " + brand + " " + model + " with OS: " + os);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off smartphone " + brand + " " + model);
    }
}

class SmartWatch extends SmartDevice {
    String os;
    int batteryLife;

    public SmartWatch(String brand, String model, String os, int batteryLife) {
        this.brand = brand;
        this.model = model;
        this.os = os;
        this.batteryLife = batteryLife;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on smartwatch " + brand + " " + model + " with OS: " + os);
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off smartwatch " + brand + " " + model);
    }
}

public class smartdevices{
    public static void main(String[] args) {
        SmartDevice smartphone = new Smartphone("Samsung", "Galaxy S24", "Android oneui", 8);
        SmartDevice smartwatch = new SmartWatch("Apple", "Watch Series 7", "iOS", 18);

        smartphone.turnOn();
        smartphone.turnOff();

        smartwatch.turnOn();
        smartwatch.turnOff();
    }
}
abstract class Device{
protected final String deviceName; 
    public Device(String deviceName){
    this.deviceName = deviceName;
}
    public abstract void Operate(); // this must be in sub class

}

class light  extends Device{
    boolean onoff = true;
    public light(String deviceName){
        super(deviceName);
    }

    @Override
    public void Operate(){
        System.out.println(deviceName + "light : " + (onoff ? "on" : "off") );


    }
}
class Thermostat extends Device{
    int temp;
    public Thermostat(String deviceName, int temp){
        super(deviceName);
        this.temp = temp;

    }
    @Override
    public void Operate(){
        System.out.println(deviceName +" is seting upto temperature :" + temp);

    }

}
class Securitycamera extends Device{
    public Securitycamera(String deviceName){
        super(deviceName);
    }
        @Override
        public void Operate(){
            System.out.println("start recorading in " + deviceName);
        }
}



public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] devices = new Device[3];
        devices[0] = new light("Living Room ");
        devices[1] = new Thermostat("Bedroom Thermostat", 22);
        devices[2] = new Securitycamera("Main Gate Camera");

        for (Device device : devices) {
            device.Operate();
        }
    }
    
}

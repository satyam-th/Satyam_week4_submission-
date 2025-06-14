class Patient {
    private String name;
    private int age;

     Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void geTreatmentplan() {
        System.out.println("Patient Name: " + name + ", Age: " + age);
    }

}
class Inpatient extends Patient {
    private String roomNumber;

    public Inpatient(String name, int age, String roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }
    @Override
    public void geTreatmentplan() {
        super.geTreatmentplan();
        System.out.println("Room Number: " + roomNumber);
    }
}
class Outpatient extends Patient {
    private String appointmentDate;

    public Outpatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    @Override
    public void geTreatmentplan() {
        super.geTreatmentplan();
        System.out.println("Appointment Date: " + appointmentDate);
    }
}


public class HospitalRecords {
    public static void main(String[] args) {
        Patient[] patients = new Patient[3];
        patients[0] = new Inpatient("ram thapa", 40, "Room 101");
        patients[1] = new Outpatient("Ravi Kumar", 30, "2023-10-01");
        patients[2] = new Inpatient("Sita Devi", 50, "Room 102");
         for (Patient p : patients) {
            p.geTreatmentplan();}
  
  
    }
}

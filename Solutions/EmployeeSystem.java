class Employee{
    String name;
    String id;
    double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
       
    }
public double calculateSalary() {
      
        return salary;
    }

    

}
class Manager extends Employee {
    private double bonus;

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

class  developer extends Employee {
    private double rate;
    private int overtimehour; 
    public developer(String name, String id, double salary, int overtimehour) {
        super(name, id, salary);
        this.overtimehour = overtimehour; 
        this.rate = 500;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + overtimehour * rate;
    }
}





public class EmployeeSystem {
    public static void main(String[] args) {
        
        Employee[] workers = new Employee[5];
        workers[0] = new Employee("hiro", "E12m", 50000);
        workers[1] = new Manager("ram", "M92c", 60000, 5000);
        workers[2] = new developer("samya sir", "D02h", 55000, 20);
        workers[3] = new Employee("David", "E19h", 52000);
        workers[4] = new Manager("sita", "m05a", 70000, 8000);
        for (Employee worker : workers) {
            System.out.println("Name: " + worker.name + ", ID: " + worker.id + ", Salary: " + worker.calculateSalary());
        }
    }
    
}

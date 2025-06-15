class person{
    private String name;
    private String  id;

    public person(String name, String id) {
        this.name = name;
        this.id = id;
    }

   public String getroleDetail(){
         return "Name: " + name + ", ID: " + id;
     
        }
}

class Student extends person {
    private String program;

    public Student(String name, String id, String program) {
        super(name, id);
        this.program = program;
    }
    @Override
    public String getroleDetail() {
        return super.getroleDetail() + ", Program: " + program;
    }   
}
class Teacher extends person {
    private String subject;

    public Teacher(String name, String id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    @Override
    public String getroleDetail() {
        return super.getroleDetail() + ", Subject: " + subject;
    }  

}

class Admin extends person {
    private String department;

    public Admin(String name, String id, String department) {
        super(name, id);
        this.department = department;
    }
    @Override
    public String getroleDetail() {
        return super.getroleDetail() + ", Department: " + department;
    }  
}



public class UniversitySystem {
    
    public static void main(String[] args) {
        person student = new Student("satyam", "S121", "BCSIT");
        person teacher = new Teacher("saumya sir ", "T456", "java Programming");
        person admin = new Admin("abc", "A789", "Administration");

        System.out.println(student.getroleDetail());
        System.out.println(teacher.getroleDetail());
        System.out.println(admin.getroleDetail());
    }
}

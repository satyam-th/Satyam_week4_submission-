class Student{
    private String name;
    private int rollNumber;
    float[] grades;
    public Student(String name, int rollNumber, float[] grades) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = grades;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public float[] getGrades() {
        return grades;
    }
    public float calculateAverage() {
        float sum = 0;
        for (float grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
class graduateStudent extends Student {
    private String thesisTopic;

    public graduateStudent(String name, int rollNumber, float[] grades, String thesisTopic) {
        super(name, rollNumber, grades);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTitle() {
        return thesisTopic;
    }
}


public class GradeBook {
    public static void main(String[] args) {
        System.out.println("non graduate student");
        Student[] students = new Student[]{
            new Student("ram", 11, new float[]{85.5f, 90.0f, 78.0f}),
            new Student("hero", 12, new float[]{88.0f, 92.5f, 80.0f}),
            new Student("sita", 03, new float[]{75.0f, 80.5f, 70.0f})
        };
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Average Grade: " + student.calculateAverage());
        }
        System.out.println("graduate student");
        graduateStudent[] gradStudents = new graduateStudent[]{
            new graduateStudent("Samya sir", 11, new float[]{85.5f, 90.0f, 78.0f}, "AI and Machine Learning"),
            new graduateStudent("hiro", 12, new float[]{88.0f, 92.5f, 80.0f}, "Blockchain Technology"),
            new graduateStudent(" riya", 03, new float[]{75.0f, 80.5f, 70.0f}, "Quantum Computing")
        };
        for (graduateStudent gradStudent : gradStudents) {
            System.out.println("Name: " + gradStudent.getName() + ", Roll Number: " + gradStudent.getRollNumber() + ", Average Grade: " + gradStudent.calculateAverage() + ", Thesis Topic: " + gradStudent.getThesisTitle());
        }
    }
}

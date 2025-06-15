class course{
  private  String title;
   private String duration;
    private String instructor;

    public course(String title, String duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }
    public void getCourseInfo() {
        System.out.println("Course Title: " + title + ", Duration: " + duration + ", Instructor: " + instructor);
    }

}

class LiveCourse extends course {
    private String schedulTime;

    public LiveCourse(String title, String duration, String instructor, String schedulTime) {
        super(title, duration, instructor);
        this.schedulTime = schedulTime;
    }

    @Override
    public void getCourseInfo() {
        super.getCourseInfo();
        System.out.println("Platform: " + schedulTime);
    }
}

class RecodedCourse extends course {
    private String videoCount;

    public RecodedCourse(String title, String duration, String instructor, String videoCount) {
        super(title, duration, instructor);
        this.videoCount = videoCount;
    }

    @Override
    public void getCourseInfo() {
        super.getCourseInfo();
        System.out.println("Access Duration: " + videoCount);
    }
}

public class CoursePortal {
    public static void main(String[] args) {
        
        course[] courses = new course[3];
        courses[0] = new LiveCourse("Java Programming", "3 months", "saumya sir", "Sunday 6.30 AM");
        courses[1] = new RecodedCourse("Python Basics", "2 months", "Saumya sir", "Lifetime Access");
        courses[2] = new LiveCourse("Web Development", "4 months", "abc", "Wednesday 8 aM");

        for (course c : courses) { //this also like for (int i = 0; i < courses.length; i++)
            c.getCourseInfo();
        }
    }
    
}

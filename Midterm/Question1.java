public class Question1 {
    public static void main(String[] args) {
        Student s1 = new Student("Parker", 001, 4.00);

        // Deep copy
        Student s2 = new Student(s1);

        // Shallow copy
        Student s3 = s1;
    }
}

class Student {
    private String name;
    private int studentID;
    private double GPA;

    // default constructor
    public Student() {
    }

    // constructor with all parameters
    public Student(String name, int studentID, double GPA) {
        this.name = name;
        this.studentID = studentID;
        this.GPA = GPA;
    }

    // constructor for deep copy
    public Student(Student student) {
        Student stu = new Student();
        this.name = student.name;;
        this.studentID = student.studentID;
        this.GPA = student.GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}

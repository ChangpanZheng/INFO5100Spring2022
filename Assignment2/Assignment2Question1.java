public class Assignment2Question1 {
    public static void main(String[] args) {

    }
}


class Main {
    public static void main(String[] args) {

        Student student1 = new Student(101, "ABC");

        System.out.println(" Roll number of the first student: "+ student1.printRoll());

        System.out.println(" Name of the first student: "+ student1.printName());

        Student student2 = new Student(student1);

        System.out.println(" Roll number of the second student: "+     student2.printRoll());

        System.out.println(" Name of the second student: "+ student2.printName());

    }
}

class Student {
    private int rollNumber;
    private String name;

    public Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
        // this = student;
    }
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student() {
    }

    public int printRoll() {
        return this.rollNumber;
    }

    public String printName() {
        return this.name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

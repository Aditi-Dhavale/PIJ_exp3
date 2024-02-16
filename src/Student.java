public class Student {
    String prn;
    String name;
    String dob;
    int marks;

    // Constructor
    Student(String prn, String name, String dob, int marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("PRN: " + prn + ", Name: " + name + ", DoB: " + dob + ", Marks: " + marks);
    }
}

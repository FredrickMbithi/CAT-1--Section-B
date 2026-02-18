/**
 * Alternative 2: StudentRecord with toString() Method Override
 * Demonstrates method overriding and cleaner display logic
 */
public class StudentRecord {
    private String studentID;
    private String name;
    private String course;

    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "\n========== STUDENT INFORMATION ==========\n" +
                "Student ID: " + studentID + "\n" +
                "Name: " + name + "\n" +
                "Course: " + course + "\n" +
                "==========================================\n";
    }

    // Display method can now use toString()
    public void displayInfo() {
        System.out.println(this.toString());
    }
}
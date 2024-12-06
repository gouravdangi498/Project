import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students; // List of all students

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // Add a new student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    // Retrieve a student by RollNumber
    public Student findStudentByRollNumber(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        System.out.println("Student with ID " + rollNumber + " not found.");
        return null;
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Calculate average marks of all students
    public double calculateAverageMarksForAllStudents(ArrayList<Student> students) {
        if (students == null || students.isEmpty()) {
            System.out.println("No students in the system.");
            return 0.0;
        }

        double totalMarks = 0.0;
        int totalCourses = 0;

        // Iterate over all students
        for (Student student : students) {
            // Sum up all scores directly
            for (double score : student.getCourses().values()) {
                totalMarks += score;
                totalCourses++;
            }
        }

        // Calculate the average
        return totalCourses > 0 ? totalMarks / totalCourses : 0.0;
    }

}
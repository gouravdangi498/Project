import java.util.HashMap;
import java.util.Map;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private Map<String, Double> courses;

    // Constructor of Student class
    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.courses = new HashMap<>();
    }

    // Getter's
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method for addCourses
    public void addCourses(String courseName, double score) {
        courses.put(courseName, score);
    }

    public Map<String, Double> getCourses() {
        return courses;
    }

    // Remove course
    public void removeCourse(String courseName) {
        if (courses.containsKey(courseName)) {
            courses.remove(courseName);
            System.out.println("Course removed: " + courseName);
        } else {
            System.out.println("Course not found: " + courseName);
        }
    }

    // Method for update score
    public void updateScore(String courseName, double score) {
        if (courses.containsKey(courseName)) {
            courses.put(courseName, score);
        } else
            System.out.println("course not found " + courseName);
    }

    // Getting score of specific course
    public double getCourseScore(String courseName) {
        if (courses.containsKey(courseName)) {
            return courses.get(courseName);// Roll of get()->Returns the value to which the specified key is mapped,
                                           // or null if this map contains no mapping for the key.
        } else {
            System.out.println("course not found " + courseName);
            return -1.0;
        }
    }

    // Calculating average score
    public double calculateAverage() {
        double total = 0.0;
        // Inhansed for loop
        for (double score : courses.values()) {// Roll of values()->Returns a Collection view of the values contained in
                                               // this map.
            total += score;
        }
        return courses.size() > 0 ? total / courses.size() : 0.0;// Roll of size()->Returns the number of key-value
                                                                 // mappings in this map.
    }
    @Override
    public String toString() {
        return "ID: " + rollNumber + ", Name: " + name + ", Age: " + age + ", Courses: " + courses;

    }

}

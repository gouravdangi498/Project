import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n=== Student Management System ===");

            System.out.println("1. Add a Student");
            System.out.println("2. Add Course for a Student");
            System.out.println("3. View All Students");
            System.out.println("4. View a Student's Courses and Marks ,updateCourse,removeCourse or getCourseMark");
            System.out.println("5. Calculate Average Marks for All Students");
            System.out.println("6. Use Calculator for Adding,Subtracting,Multiplication,Division and Average etc. ");
            System.out.println("7. Exit");

            boolean validInput = false;
            int choice = 0;
            while (!validInput) {
                System.out.print("Enter your choice: ");
                try {
                    // scanner.next();
                    choice = scanner.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Please enter a valid Integer value.");
                    scanner.next();
                }

            }
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of student's you want to add :");
                    int numberOfStudent = scanner.nextInt();
                    for (int i = 1; i <= numberOfStudent; i++) {
                        System.out.println("Enter the data of your student :" + i);
                        System.out.print("Enter Student RollNumber : ");
                        int rollNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        Student student = new Student(rollNumber, name, age);
                        manager.addStudent(student);

                    }
                    System.out.println("Student added successfully.");

                    for (int i = 0; i < 20; i++) {
                        System.out.print("-------");
                    }
                    break;

                case 2:
                    System.out.print("Enter Student RollNumber : ");
                    int studentRollNumber = scanner.nextInt();
                    Student existingStudent = manager.findStudentByRollNumber(studentRollNumber);
                    if (existingStudent != null) {
                        scanner.nextLine();
                        System.out.print("Enter Course Name: ");
                        String courseName = scanner.nextLine();
                        System.out.print("Enter Score : ");
                        double score = scanner.nextDouble();
                        existingStudent.addCourses(courseName, score);
                        System.out.println("Course added successfully.");
                        for (int i = 0; i < 20; i++) {
                            System.out.print("-------");
                        }
                    }
                    break;

                case 3:
                    manager.displayAllStudents();
                    break;

                case 4:
                    System.out.print("Enter Student RollNumber : ");
                    int viewRollNumber = scanner.nextInt();

                    Student studentToView = manager.findStudentByRollNumber(viewRollNumber);
                    if (studentToView != null) {
                        System.out.println("1. View a Student's Courses and Marks");
                        System.out.println("2. updateCourse");
                        System.out.println("3. removeCourse");
                        System.out.println("3. getCourseMark");
                        System.out.print("Enter your choice: ");
                        int value = scanner.nextInt();
                        switch (value) {
                            case 1:
                                System.out.println("Courses and Score for " + studentToView.getName() + ":");
                                System.out.println(studentToView.getCourses());
                                System.out.println("Average Score: " + studentToView.calculateAverage());

                                break;
                            case 2:
                                scanner.nextLine();
                                System.out.print("Enter Course Name: ");
                                String courseName = scanner.nextLine();
                                System.out.print("Enter Score : ");
                                double score = scanner.nextDouble();
                                studentToView.updateScore(courseName, score);
                                System.out.println("Course update successfully.");
                                break;
                            case 3:
                                System.out.print("Enter Course Name you want to remove: ");
                                String courseRemove = scanner.nextLine();
                                studentToView.removeCourse(courseRemove);
                                break;
                            case 4:
                                System.out.print("Enter Course : ");
                                String s = scanner.nextLine();
                                double result = studentToView.getCourseScore(s);
                                System.out.println(s + "mark is " + result);
                                break;
                            default:
                                System.out.println("Invalid choice. Try again.");
                                break;
                        }
                    }

                    for (int i = 0; i < 20; i++) {
                        System.out.print("-------");
                    }
                    break;

                case 5:
                    double averageMarks = manager.calculateAverageMarksForAllStudents(manager.students);
                    System.out.println("Average Marks for All Students: " + averageMarks);
                    for (int i = 0; i < 20; i++) {
                        System.out.print("-------");
                    }
                    break;
                case 6:
                    System.out.println("Welcome in My Calculator :");
                    Calculator obj = new Calculator();
                    obj.calc();
                    for (int i = 0; i < 20; i++) {
                        System.out.print("-------");
                    }
                    break;
                case 7:
                    System.out.println("Exiting. Thank you!");
                    scanner.close();
                    for (int i = 0; i < 20; i++) {
                        System.out.print("-------");
                    }
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
                    for (int i = 0; i < 20; i++) {
                        System.out.print("-------");
                    }
            }
        }
    }
}
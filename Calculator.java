import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator{
    Scanner scanner = new Scanner(System.in);

    public void add() {
        ArrayList<Double> nums = new ArrayList<>();
        System.out.print("Enter the number you want to add :");
        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter your number " + i);
            double num = scanner.nextDouble();
            nums.add(num);
        }
        double total = 0;
        for (double s : nums) {
            total += s;
        }
        System.out.println("Total is :" + total);
    }

    public void multi() {
        ArrayList<Double> nums = new ArrayList<>();
        System.out.print("Enter the number you want to Multi.. :");
        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter your number " + i);
            double num = scanner.nextDouble();
            nums.add(num);
        }
        double total = 1;
        for (double s : nums) {
            total *= s;
        }
        System.out.println("Total is :" + total);
    }

    public void avg() {
        System.out.print("Enter the number you want to find Average :");
        ArrayList<Double> nums = new ArrayList<>();
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter your number " + i);
            double num = scanner.nextDouble();
            nums.add(num);
        }
        double total = 0;
        for (double s : nums) {
            total += s;
        }
         if(count>0){
            System.out.println("Average is : " + total / count);
         }
         else
         System.out.println("count can't be zero :"+0.0);
        
    }

    public void calc() {

        System.out.println("Welcome to the Advanced Calculator!");
        System.out.println("Select an operation:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Power (^)");
        System.out.println("6: Square Root (√)");
        System.out.println("7: Logarithm (log)");
        System.out.println("8: Cube Root ()");
        System.out.println("9: sine (sin)");
        System.out.println("10: Cosine (cos)");
        System.out.println("11: Average ");
        System.out.println("12: Exit");

        while (true) {
          //  System.out.print("\nEnter your choice (0-10): ");
           // int choice = scanner.nextInt();
            boolean validInput = false;
            int choice = 0;
            while (!validInput) {
                System.out.print("Enter your choice: ");
                try {
                    choice = scanner.nextInt();
                    validInput = true;
                } catch (Exception e) {
                    System.out.println("Please enter a valid Integer value.");
                    scanner.next();
                }

            }
            
            double num1, num2;

            switch (choice) {
                case 1:
                    add();
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;

                case 3:
                    multi();
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    System.out.print("Enter the base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;

                case 6:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("Result: " + Math.sqrt(num1));
                    } else {
                        System.out.println("Error: Negative numbers do not have real square roots.");
                    }
                    break;

                case 7:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 > 0) {
                        System.out.println("Result: " + Math.log(num1));
                    } else {
                        System.out.println("Error: Logarithm of non-positive numbers is undefined.");
                    }
                    break;

                case 8:
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.cbrt(num1));
                    break;

                case 9:
                    System.out.print("Enter an angle in degrees: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.sin(Math.toRadians(num1)));
                    break;

                case 10:
                    System.out.print("Enter an angle in degrees: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.cos(Math.toRadians(num1)));
                    break;
                case 11:
                    avg();
                    break;
                 case 12:
                    System.out.println("Exiting. Thank you!");
                    return;
                    
                    
                   
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

       
    }
}



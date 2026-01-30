// Que 32: Write a program which is a Menu-Driven Program to perform a simple calculation

import java.io.*;

public class Q32menudriven {
    public static void main(String[] args) throws IOException {
        double num1, num2, result;
        int choice;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Menu-Driven Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        choice = Integer.parseInt(br.readLine());

        System.out.print("Enter first number: ");
        num1 = Double.parseDouble(br.readLine());
        System.out.print("Enter second number: ");
        num2 = Double.parseDouble(br.readLine());

        switch (choice) {
            case 1 -> {
                result = num1 + num2;
                System.out.println("Result: " + result);
            }
            case 2 -> {
                result = num1 - num2;
                System.out.println("Result: " + result);
            }
            case 3 -> {
                result = num1 * num2;
                System.out.println("Result: " + result);
            }
            case 4 -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
            }
            default -> System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    
}

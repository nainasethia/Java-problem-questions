//Que 20:  Write a Program to make simple calculator using arithmetic operation. 

import java.io.*;

public class Q20calcu {
    public static void main(String[] args) throws IOException {
        double num1, num2, result;
        char operator;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter first number: ");
        num1 = Double.parseDouble(br.readLine());
        
        System.out.print("Enter second number: ");
        num2 = Double.parseDouble(br.readLine());
        
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = (char) br.read();
        
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println("Result: " + result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println("Result: " + result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println("Result: " + result);
            }
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            }
            default -> System.out.println("Error: Invalid operator.");
        }
    }
    
}

// Que 26: Write a program to find the largest of three numbers. 

import java.io.*;

public class Q26largest {
    public static void main(String[] args) throws IOException {
        int num1, num2, num3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number: ");
        num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter second number: ");
        num2 = Integer.parseInt(br.readLine());

        System.out.print("Enter third number: ");
        num3 = Integer.parseInt(br.readLine());

        // Finding the largest number
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
    }
    
}

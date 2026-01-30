// Que 22: Write a program to accept two integers and check whether they are equal or not. 

import java.io.*;

public class Q22equalornot {
    public static void main(String[] args) throws IOException {
        int num1, num2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter first integer: ");
        num1 = Integer.parseInt(br.readLine());
        
        System.out.print("Enter second integer: ");
        num2 = Integer.parseInt(br.readLine());
        
        // Checking if the two integers are equal
        if (num1 == num2) {
            System.out.println("The two integers are equal.");
        } else {
            System.out.println("The two integers are not equal.");
        }
    }
}
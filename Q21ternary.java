// Que 21: Write a Program to find greater number among two number using ternary operator. 

import java.io.*;

public class Q21ternary {
    public static void main(String[] args) throws IOException {
        int num1, num2, greater;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter first number: ");
        num1 = Integer.parseInt(br.readLine());
        
        System.out.print("Enter second number: ");
        num2 = Integer.parseInt(br.readLine());
        
        // Using ternary operator to find the greater number
        greater = (num1 > num2) ? num1 : num2;
        
        System.out.println("The greater number is: " + greater);
    }
    
}

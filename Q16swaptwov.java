// Que 16: Write a Program to swap two numbers using two variables. 

import java.io.*;

public class Q16swaptwov {

    public static void main(String[] args) throws IOException {
        int a, b, temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number (a): ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter second number (b): ");
        b = Integer.parseInt(br.readLine());
        
        // Swapping using a temporary variable
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping:");
        System.out.println("First number (a): " + a);
        System.out.println("Second number (b): " + b);
    }
    
}

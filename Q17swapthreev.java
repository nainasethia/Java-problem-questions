// Que 17:  Write a Program to swap two numbers using third variables. 

import java.io.*;


public class Q17swapthreev {

    public static void main(String[] args) throws IOException {
        int x, y, temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number (x): ");
        x = Integer.parseInt(br.readLine());
        System.out.print("Enter second number (y): ");
        y = Integer.parseInt(br.readLine());
        
        // Swapping using a third variable
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("After swapping:");
        System.out.println("First number (x): " + x);
        System.out.println("Second number (y): " + y);
    }
    
}

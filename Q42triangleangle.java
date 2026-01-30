// Que 42: Write a program to check whether a triangle can be formed by the given value for the angles.  
// Test Data:  
// 40 55 65 
// Expected Output:  
// The triangle is not valid. 

import java.io.*;

public class Q42triangleangle {
    public static void main(String[] args) throws IOException {
        int angle1, angle2, angle3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first angle: ");
        angle1 = Integer.parseInt(br.readLine());

        System.out.print("Enter second angle: ");
        angle2 = Integer.parseInt(br.readLine());

        System.out.print("Enter third angle: ");
        angle3 = Integer.parseInt(br.readLine());

        // Checking if the triangle is valid
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
    
}

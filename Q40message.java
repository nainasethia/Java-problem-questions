//Que 40: Write a program to read temperature in centigrade and display a suitable message according to 
// temperature state below:  
// Temp < 0 then Freezing weather 
// Temp 0-10 then Very Cold weather 
// Temp 10-20 then Cold weather 
// Temp 20-30 then Normal in Temp 
// Temp 30-40 then Its Hot 
// Temp >=40 then Its Very Hot 
// Test Data : 
// 42 
// Expected Output : 
// It’s very hot.

import java.io.*;

public class Q40message {
    public static void main(String[] args) throws IOException {
        int temp;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter temperature in centigrade: ");
        temp = Integer.parseInt(br.readLine());

        // Displaying message based on temperature
        if (temp < 0) {
            System.out.println("Freezing weather");
        } else if (temp >= 0 && temp < 10) {
            System.out.println("Very Cold weather");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("Cold weather");
        } else if (temp >= 20 && temp < 30) {
            System.out.println("Normal in Temp");
        } else if (temp >= 30 && temp < 40) {
            System.out.println("It's Hot");
        } else {
            System.out.println("It's Very Hot");
        }
    }
    
}

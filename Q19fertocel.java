// Que 19:  Write a Program to convert Fahrenheit into Celsius. 

import java.io.*;

public class Q19fertocel {
    public static void main(String[] args) throws IOException {
        double fahrenheit, celsius;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = Double.parseDouble(br.readLine());
        
        // Conversion formula
        celsius = (fahrenheit - 32) * 5/9;
        
        System.out.println("Temperature in Celsius: " + celsius);
    }
}

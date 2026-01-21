// Que 18: Write a Program to convert Celsius into Fahrenheit. 

import java.io.*;

public class Q18celtofer {

    public static void main(String[] args) throws IOException {
        double celsius, fahrenheit;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter temperature in Celsius: ");
        celsius = Double.parseDouble(br.readLine());
        
        // Conversion formula
        fahrenheit = (celsius * 9/5) + 32;
        
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
    
}

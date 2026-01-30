// Que 27: W.A.P enter a number to check number is positive, negative or Zero. 

import java.io.*;

public class Q27posnegze {
    public static void main(String[] args) throws IOException {
        double number;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        number = Double.parseDouble(br.readLine());

        // Checking if the number is positive, negative or zero
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    
}

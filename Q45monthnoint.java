// Que 45: Write a program to read any Month Number in integer and display the number of days for this 
// month.  
// Test Data:  
// 7 
// Expected Output:  
// Month have 31 days

import java.io.*;

public class Q45monthnoint {
    public static void main(String[] args) throws IOException {
        int month;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter month number (1-12): ");
        month = Integer.parseInt(br.readLine());

        // Displaying number of days in the month based on the number
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Month has 31 days");
            case 4, 6, 9, 11 -> System.out.println("Month has 30 days");
            case 2 -> System.out.println("Month has 28 or 29 days");
            default -> System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
    
}

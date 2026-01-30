// Que 30: Write a program to read any Month Number in integer and display Month name in the word. 

import java.io.*;

public class Q30monthnumb {
    public static void main(String[] args) throws IOException {
        int month;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter month number (1-12): ");
        month = Integer.parseInt(br.readLine());

        // Displaying Month name based on the number
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }

    
}

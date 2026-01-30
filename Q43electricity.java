//Que 43: Write a program to calculate and print the Electricity bill of a given customer. The customer id., name 
// and unit consumed by the user should be taken from the keyboard and display the total amount to pay to 

// the customer. The charge are as follow: 
// Unit                         | Charge/unit
// -----------------------------|-------------
// Up to 199                    | @1.20
// 200 and above but less than 400 | @1.50
// 400 and above but less than 600 | @1.80
// 600 and above               | @2.00

// If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill should be of Rs. 
// 100/-.

import java.io.*;

public class Q43electricity {
    public static void main(String[] args) throws IOException {
        int customerId, unitsConsumed;
        String customerName;
        double totalAmount;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Customer ID: ");
        customerId = Integer.parseInt(br.readLine());

        System.out.print("Enter Customer Name: ");
        customerName = br.readLine();

        System.out.print("Enter Units Consumed: ");
        unitsConsumed = Integer.parseInt(br.readLine());

        // Calculating the bill based on units consumed
        if (unitsConsumed < 200) {
            totalAmount = unitsConsumed * 1.20;
        } else if (unitsConsumed < 400) {
            totalAmount = unitsConsumed * 1.50;
        } else if (unitsConsumed < 600) {
            totalAmount = unitsConsumed * 1.80;
        } else {
            totalAmount = unitsConsumed * 2.00;
        }

        // Adding surcharge if applicable
        if (totalAmount > 400) {
            totalAmount += totalAmount * 0.15; // 15% surcharge
        }

        // Ensuring minimum bill amount
        if (totalAmount < 100) {
            totalAmount = 100;
        }

        // Displaying the bill details
        System.out.println("\nCustomer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.printf("Total Amount to Pay: Rs. %.2f\n", totalAmount);
    }
    
}

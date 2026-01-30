// Que 46: Write a program to calculate profit and loss on a transaction.  
// Test Data:  
// 500 700 
// Expected Output:  
// You can booked your profit amount: 200

import java.io.*;

public class Q46profit {
    public static void main(String[] args) throws IOException {
        double costPrice, sellingPrice, profit, loss;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Cost Price: ");
        costPrice = Double.parseDouble(br.readLine());

        System.out.print("Enter Selling Price: ");
        sellingPrice = Double.parseDouble(br.readLine());

        // Calculating profit or loss
        if (sellingPrice > costPrice) {
            profit = sellingPrice - costPrice;
            System.out.println("You can booked your profit amount: " + profit);
        } else if (costPrice > sellingPrice) {
            loss = costPrice - sellingPrice;
            System.out.println("You have incurred a loss amount: " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }
    }
    
}

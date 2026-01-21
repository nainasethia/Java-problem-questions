// Que 12: Write a Program to calculate Compound Interest. 

import java.io.*;

public class Q12CI {

    public static void main(String[] args) throws IOException {
        double p, r, t, ci, amount;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter principal amount: ");
        p = Double.parseDouble(br.readLine());
        System.out.print("Enter rate of interest: ");
        r = Double.parseDouble(br.readLine());
        System.out.print("Enter time in years: ");
        t = Double.parseDouble(br.readLine());
        amount = p * Math.pow((1 + r / 100), t);
        ci = amount - p;
        System.out.println("The Compound Interest is: " + ci);
    }
    
}

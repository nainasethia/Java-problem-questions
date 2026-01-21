// Que 15: Write a Program to enter divisor and dividend find quotient and reminder. 

import java.io.*;

public class Q15quo {

    public static void main(String[] args) throws IOException {
        int dividend, divisor, quotient, remainder;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter dividend: ");
        dividend = Integer.parseInt(br.readLine());
        System.out.print("Enter divisor: ");
        divisor = Integer.parseInt(br.readLine());
        quotient = dividend / divisor;
        remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
    
}

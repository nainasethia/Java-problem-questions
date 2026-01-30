// Que 24: W.A.P to enter two number find number is greater or smaller. 

import java.io.*;

public class Q24greatorsmall {

    public static void main(String[] args) throws IOException {
        int num1, num2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first integer: ");
        num1 = Integer.parseInt(br.readLine());

        System.out.print("Enter second integer: ");
        num2 = Integer.parseInt(br.readLine());

        // Checking which number is greater or smaller
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is smaller than " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
    
}

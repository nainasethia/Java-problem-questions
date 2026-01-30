// Que 33: W.A.P to display odd number prime pairs. 

import java.io.*;

public class Q33oddnoprimeno {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the lower limit: ");
        int lower = Integer.parseInt(br.readLine());

        System.out.print("Enter the upper limit: ");
        int upper = Integer.parseInt(br.readLine());

        System.out.println("Odd number prime pairs between " + lower + " and " + upper + ":");
        for (int num = lower; num <= upper; num++) {
            if (isOdd(num) && isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}

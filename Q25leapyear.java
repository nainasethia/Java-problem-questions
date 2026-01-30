// Que 25: Write a program to find whether a given year is a leap year or not.  

import java.io.*;

public class Q25leapyear {

    public static void main(String[] args) throws IOException {
        int year;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a year: ");
        year = Integer.parseInt(br.readLine());

        // Checking if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    
}

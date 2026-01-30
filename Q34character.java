// Que 34:  Write a program to check whether a character is an alphabet, digit or special character. 

import java.io.*;

public class Q34character {
    public static void main(String[] args) throws IOException {
        char ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a character: ");
        ch = br.readLine().charAt(0);

        // Checking if the character is an alphabet, digit or special character
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
    
}

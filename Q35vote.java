// Que 35:  Write a program to check whether a character is an alphabet, digit or special character. 

import java.io.*;

public class Q35vote {
    public static void main(String[] args) throws IOException {
        int age;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your age: ");
        age = Integer.parseInt(br.readLine());

        // Checking if the person is eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
    
}

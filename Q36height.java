// Que 36:  Write a program to accept the height of a person in centimetre and categorize the person according to their height.

import java.io.*;

public class Q36height {
    public static void main(String[] args) throws IOException {
        int height;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your height in centimetres: ");
        height = Integer.parseInt(br.readLine());

        // Categorizing the person according to their height
        if (height < 150) {
            System.out.println("You are Dwarf.");
        } else if (height >= 150 && height <= 170) {
            System.out.println("You are Average heighted.");
        } else {
            System.out.println("You are Tall.");
        }
    }
    
}

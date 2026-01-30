// Que 31: W.A.P to enter a character find Vowel or Consonant using switch statement. 

import java.io.*;

public class Q31vowconswitch {
    public static void main(String[] args) throws IOException {
        char ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a character: ");
        ch = br.readLine().charAt(0);

        // Checking if the character is an alphabet
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            // Using switch statement to find Vowel or Consonant
            switch (ch) {
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> System.out.println(ch + " is a vowel.");
                default -> System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }

    
}

//Que 29: W.A.P to enter a character find Vowel or Consonant using OR Operator. 

import java.io.*;

public class Q29vowconsOROp {
    public static void main(String[] args) throws IOException {
        char ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a character: ");
        ch = br.readLine().charAt(0);

        // Checking if the character is a vowel or consonant using OR operator
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) { // Check if it's an alphabet
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
    
}

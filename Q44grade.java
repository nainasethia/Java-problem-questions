// Que 44:  Write a program to accept a grade and declare the equivalent description 
// Grade | Description
// ------|------------
// E     | Excellent
// V     | Very Good
// G     | Good
// A     | Average
// F     | Fail

import java.io.*;

public class Q44grade {
    public static void main(String[] args) throws IOException {
        char grade;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your grade (E, V, G, A, F): ");
        grade = br.readLine().charAt(0);

        // Declaring the equivalent description based on the grade
        switch (grade) {
            case 'E' -> System.out.println("Excellent");
            case 'V' -> System.out.println("Very Good");
            case 'G' -> System.out.println("Good");
            case 'A' -> System.out.println("Average");
            case 'F' -> System.out.println("Fail");
            default -> System.out.println("Invalid grade entered.");
        }
    }
}

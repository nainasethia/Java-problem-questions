// Que 38: Write a program to calculate the root of a Quadratic Equation. 

import java.io.*;

public class Q38quadraticeq {
    public static void main(String[] args) throws IOException {
        double a, b, c, discriminant, root1, root2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter coefficient a: ");
        a = Double.parseDouble(br.readLine());

        System.out.print("Enter coefficient b: ");
        b = Double.parseDouble(br.readLine());

        System.out.print("Enter coefficient c: ");
        c = Double.parseDouble(br.readLine());

        // Calculating the discriminant
        discriminant = b * b - 4 * a * c;

        // Finding the roots based on the value of the discriminant
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("Roots are real and the same.");
            System.out.println("Root: " + root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
    
}

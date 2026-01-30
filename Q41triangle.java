//Que 41: Write a program to check whether a triangle is Equilateral, Isosceles or Scalene.

import java.io.*;

public class Q41triangle {
    public static void main(String[] args) throws IOException {
        double side1, side2, side3;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter length of first side: ");
        side1 = Double.parseDouble(br.readLine());

        System.out.print("Enter length of second side: ");
        side2 = Double.parseDouble(br.readLine());

        System.out.print("Enter length of third side: ");
        side3 = Double.parseDouble(br.readLine());

        // Checking the type of triangle
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
    }
}

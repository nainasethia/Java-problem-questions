//Que 8: Write a Program to find area of rectangle.

import java.io.*;
public class Q8arearec {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter length of rectangle: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter breadth of rectangle: ");
        b = Integer.parseInt(br.readLine());
        c = a * b;
        System.out.println("The area of rectangle is: " + c);
    }
}
    
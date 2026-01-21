// Que 6:Write a Program to division of two numbers User through. 

import java.io.*;
public class Q6div {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter second number: ");
        b = Integer.parseInt(br.readLine());
        c = a / b;
        System.out.println("The division is: " + c);
    }
}
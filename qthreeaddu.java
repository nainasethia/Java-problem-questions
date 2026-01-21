//  Que 3: Write a Program to add two numbers User through. 

import java.io.*;

class qthreeaddu {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter second number: ");
        b = Integer.parseInt(br.readLine());
        c = a + b;
        System.out.println("The sum is: " + c);
    }
}
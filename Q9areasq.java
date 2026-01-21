//Que 9:  Write a Program to find area of square. 

import java.io.*;

public class Q9areasq {
    public static void main(String[] args) throws IOException {
        int a, c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter side of square: ");
        a = Integer.parseInt(br.readLine());
        c = a * a;
        System.out.println("The area of square is: " + c);
    }
    
}

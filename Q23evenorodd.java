// Que 23:  Write a program to check whether a given number is even or odd .

import java.io.*;

public class Q23evenorodd {

    public static void main(String[] args) throws IOException {
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        num = Integer.parseInt(br.readLine());

        if (num % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }

}
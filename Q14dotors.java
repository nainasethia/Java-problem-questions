//Que 14: Write a Program to convert dollar into rupees. 

import java.io.*;

public class Q14dotors {

    public static void main(String[] args) throws IOException {
        double dollar, rupees;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter amount in dollars: ");
        dollar = Double.parseDouble(br.readLine());
        rupees = dollar * 91.0; // Assuming 1 dollar = 91 rupees
        System.out.println("Amount in rupees: " + rupees);
    }
    
}

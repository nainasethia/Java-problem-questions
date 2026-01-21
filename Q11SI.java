//Que 11: Write a Program to calculate Simple Interest. 

import java.io.*;

public class Q11SI {

    public static void main(String[] args) throws IOException {
        float p, r, t, si;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter principal amount: ");
        p = Float.parseFloat(br.readLine());
        System.out.print("Enter rate of interest: ");
        r = Float.parseFloat(br.readLine());
        System.out.print("Enter time in years: ");
        t = Float.parseFloat(br.readLine());
        si = (p * r * t) / 100;
        System.out.println("The Simple Interest is: " + si);
    }
    
}

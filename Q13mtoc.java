// Que 13: Write a Program to convert meter into centimeter. 

import java.io.*;

public class Q13mtoc {

    public static void main(String[] args) throws IOException {
        double meter, centimeter;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter length in meters: ");
        meter = Double.parseDouble(br.readLine());
        centimeter = meter * 100;
        System.out.println("Length in centimeters: " + centimeter);
    }
    
}

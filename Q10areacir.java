// Que 10:  Write a Program to find area of circle and perimeters.  

import java.io.*;

public class Q10areacir {

    public static void main(String[] args) throws IOException {
        double r, area, perimeter;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter radius of circle: ");
        r = Double.parseDouble(br.readLine());
        area = Math.PI * r * r;
        perimeter = 2 * Math.PI * r;
        System.out.println("The area of circle is: " + area);
        System.out.println("The perimeter of circle is: " + perimeter);
    }
    
}

// Que 39: 18. Write a program to read roll no, name and marks of three subjects and calculate the total, percentage 
// and division.  
// Test Data : 
// Input the Roll Number of the student :784 
// Input the Name of the Student :James 
// Input the marks of Physics, Chemistry and Computer Application : 70 80 90 
// Expected Output : 
// Roll No : 784 
// Name of Student : James 
// Marks in Physics : 70 
// Marks in Chemistry : 80 
// Marks in Computer Application : 90 
// Total Marks = 240 
// Percentage = 80.00 
// Division = First 

import java.io.*;

public class Q39subject {
    public static void main(String[] args) throws IOException {
        int rollNo, phy, chem, comp;
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input the Roll Number of the student: ");
        rollNo = Integer.parseInt(br.readLine());

        System.out.print("Input the Name of the Student: ");
        name = br.readLine();

        System.out.print("Input the marks of Physics: ");
        phy = Integer.parseInt(br.readLine());

        System.out.print("Input the marks of Chemistry: ");
        chem = Integer.parseInt(br.readLine());

        System.out.print("Input the marks of Computer Application: ");
        comp = Integer.parseInt(br.readLine());

        int total = phy + chem + comp;
        double percentage = total / 3.0;
        String division;

        if (percentage >= 60) {
            division = "First";
        } else if (percentage >= 45) {
            division = "Second";
        } else if (percentage >= 33) {
            division = "Third";
        } else {
            division = "Fail";
        }

        System.out.println("\nRoll No : " + rollNo);
        System.out.println("Name of Student : " + name);
        System.out.println("Marks in Physics : " + phy);
        System.out.println("Marks in Chemistry : " + chem);
        System.out.println("Marks in Computer Application : " + comp);
        System.out.println("Total Marks = " + total);
        System.out.printf("Percentage = %.2f\n", percentage);
        System.out.println("Division = " + division);
    }

    
}

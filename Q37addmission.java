// Que 37:  Write a program to find the eligibility of admission for a professional course based on the following 
// criteria: 
// Eligibility Criteria : 
// Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 and Total in all three subject >=190 
// or Total in Maths and Physics >=140 ------------------------------------- Input the marks obtained in Physics: 65 
// Input the marks obtained in Chemistry: 51 Input the marks obtained in Mathematics: 72 Total marks of 
// Maths, Physics and Chemistry: 188 Total marks of Maths and Physics: 137 The candidate is not eligible. 
// Expected Output:  
// The candidate is not eligible for admission.

import java.io.*;

public class Q37addmission {
    public static void main(String[] args) throws IOException {
        int marksMaths, marksPhy, marksChem;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input the marks obtained in Physics: ");
        marksPhy = Integer.parseInt(br.readLine());

        System.out.print("Input the marks obtained in Chemistry: ");
        marksChem = Integer.parseInt(br.readLine());

        System.out.print("Input the marks obtained in Mathematics: ");
        marksMaths = Integer.parseInt(br.readLine());

        int totalAll = marksMaths + marksPhy + marksChem;
        int totalMathsPhy = marksMaths + marksPhy;

        System.out.println("Total marks of Maths, Physics and Chemistry: " + totalAll);
        System.out.println("Total marks of Maths and Physics: " + totalMathsPhy);

        // Checking eligibility criteria
        if ((marksMaths >= 65 && marksPhy >= 55 && marksChem >= 50 && totalAll >= 190) ||
            (totalMathsPhy >= 140)) {
            System.out.println("The candidate is eligible for admission.");
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }
    }
    
}

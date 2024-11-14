
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class L4Q6 {
    
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter three values
        System.out.print("Enter value for x1: ");
        double x1 = scanner.nextDouble(); 
        System.out.print("Enter value for x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter value for x3: ");
        double x3 = scanner.nextDouble();
        double mean = (x1 + x2 + x3) / 3;
        double variance = ((Math.pow(x1 - mean, 2) + Math.pow(x2 - mean, 2) + Math.pow(x3 - mean, 2)) / 3);
        double standardDeviation = Math.sqrt(variance);
        
        // Display the results
        System.out.printf("Mean : %.2f\n", mean);
        System.out.printf("Variance : %.2f\n", variance);
        System.out.printf("Standard Deviation : %.2f\n", standardDeviation);
        
        scanner.close();
    }
    
}

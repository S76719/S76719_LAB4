
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class L4Q1 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String InputRadius = JOptionPane.showInputDialog("Enter radius of circle :");
          double  Radius = Double.parseDouble(InputRadius);
          
          double diameter = 2 * Radius;
          double circumference = 2* 3.14159 * Radius ;
          double area = 3.14159 * Math.pow(Radius ,2 ) ;
          
           JOptionPane.showMessageDialog(null, "Diameter is :  " + String.format("%.2f", diameter));
           JOptionPane.showMessageDialog(null, "The cicumference is : " + String.format ("%.2f " , circumference));
           JOptionPane.showMessageDialog(null, "The area is :" + String.format ("%.2f" , area )) ; 
           

          
    }
    
}

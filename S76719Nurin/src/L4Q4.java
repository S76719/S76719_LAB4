
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class L4Q4 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a string:");
        
        // Initialize a StringBuilder to store the converted string
        StringBuilder converted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); // Get each character directly
            
            if (Character.isLowerCase(c)) {
                converted.append(Character.toUpperCase(c));
            }
          
            else if (Character.isUpperCase(c)) {
                converted.append(Character.toLowerCase(c));
            }
        }
        JOptionPane.showMessageDialog(null, "Converted string: " + converted.toString());
            }

}

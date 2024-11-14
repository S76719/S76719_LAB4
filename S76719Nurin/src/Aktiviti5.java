
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Aktiviti5 {
    
     public static void main(String[] args) {
        // Prompt for distance in meters
       String distanceStr = JOptionPane.showInputDialog("Enter distance in meters:");
        double distance = Double.parseDouble(distanceStr);
        String hoursStr = JOptionPane.showInputDialog("Enter time - hours:");
        double hours = Double.parseDouble(hoursStr);
        String minutesStr = JOptionPane.showInputDialog("Enter time - minutes:");
        double minutes = Double.parseDouble(minutesStr);
        String secondsStr = JOptionPane.showInputDialog("Enter time - seconds:");
        double seconds = Double.parseDouble(secondsStr);

        double totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // Calculate speeds
        double speedMetersPerSecond = distance / totalSeconds;
        double speedKilometersPerHour = (distance / 1000) / (totalSeconds / 3600.0);
        double speedMilesPerHour = (distance / 1609) / (totalSeconds / 3600.0);
        
        String message = String.format("Speed:\n" +
                                       "- Meters per second: %.2f m/s\n" +
                                       "- Kilometers per hour: %.2f km/h\n" +
                                       "- Miles per hour: %.2f mph", 
                                       speedMetersPerSecond, speedKilometersPerHour, speedMilesPerHour);
        JOptionPane.showMessageDialog(null, message);
}
}

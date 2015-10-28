/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author User1
 */
public class KPICalc
{
    
    public static String getOccupancyRate(double currentCapacity, double totalCapacity)
    {
        double occupancyPercentage = currentCapacity / totalCapacity * 100;
        
        String s = String.valueOf(occupancyPercentage);
        String occupancyRate = s.concat("%");
        
        return occupancyRate;
    }
    
    public static String getWasteRate(double numberPlanted, double numberHarvestable)
    {
        double wastePercentage = 100 - numberHarvestable / numberPlanted * 100;
        
        String s = String.valueOf(wastePercentage);
        String wasteRate = s.concat("%");
        
        return wasteRate;
    }
    
    //Mainmethod purely for testing purposes
    public static void main (String [] args)
    {
        System.out.println("Belægningsprocent: " + getOccupancyRate(4767, 5000));
        System.out.println("Spildprocent: " + getWasteRate(400, 399));
    }
}

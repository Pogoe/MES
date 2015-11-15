package Controller;

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
}

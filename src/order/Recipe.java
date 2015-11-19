package order;

import java.util.HashMap;
import java.util.Map;

public class Recipe
{
    private int id;
    private String name;
    private int startMinTemp, startMaxTemp;
    private int endMinTemp, endMaxTemp;
    private int minMoistLevel, maxMoistLevel;
    private int waterCycle;
    private int waterTime;
    private int sunCycle;

    public Recipe(int id, String name, int startMinTemp, int startMaxTemp, int endMinTemp, int endMaxTemp, int minMoistLevel, int maxMoistLevel, int waterCycle, int waterTime, int sunCycle)
    {
        this.id = id;
        this.name = name;
        this.startMinTemp = startMinTemp;
        this.startMaxTemp = startMaxTemp;
        this.endMinTemp = endMinTemp;
        this.endMaxTemp = endMaxTemp;
        this.minMoistLevel = minMoistLevel;
        this.maxMoistLevel = maxMoistLevel;
        this.waterCycle = waterCycle;
        this.waterTime = waterTime;
        this.sunCycle = sunCycle;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
    
    public int getStartMinTemp()
    {
        return startMinTemp;
    }

    public int getStartMaxTemp()
    {
        return startMaxTemp;
    }

    public int getEndMinTemp()
    {
        return endMinTemp;
    }

    public int getEndMaxTemp()
    {
        return endMaxTemp;
    }

    public int getMinMoistLevel()
    {
        return minMoistLevel;
    }

    public int getMaxMoistLevel()
    {
        return maxMoistLevel;
    }

    public int getWaterCycle()
    {
        return waterCycle;
    }

    public int getWaterTime()
    {
        return waterTime;
    }

    public int getSunCycle()
    {
        return sunCycle;
    }
    
    public Map<String, Integer> toHashMap()
    {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("startMinTemp", startMinTemp);
        map.put("startMaxTemp", startMaxTemp);
        map.put("endMinTemp", endMaxTemp);
        map.put("endMaxTemp", endMinTemp);
        map.put("MinMoistLevel", minMoistLevel);
        map.put("maxMoistLevel", maxMoistLevel);
        map.put("waterCycle", waterCycle);
        map.put("waterTime", waterTime);
        map.put("sunCycle", sunCycle);
        
        return map;
    }

    @Override
    public String toString()
    {
        return "Recipe{" + "id=" + id + ", name=" + name + ", startMinTemp=" + startMinTemp + ", startMaxTemp=" + startMaxTemp + ", endMinTemp=" + endMinTemp + ", endMaxTemp=" + endMaxTemp + ", minMoistLevel=" + minMoistLevel + ", maxMoistLevel=" + maxMoistLevel + ", waterCycle=" + waterCycle + ", waterTime=" + waterTime + ", sunCycle=" + sunCycle + '}';
    }
}
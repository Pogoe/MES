package order;

import crud.IRecipeCRUD;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Order implements Serializable
{
    private static List<PlantTypes> names = new ArrayList<>();
    private static List<Integer> quantities = new ArrayList<>();
    private static Random random = new Random();
    private Recipe recipe;
    private int id;
    private String name;
    private int quantity;
    
    public Order(int id, String name, int quantity, Recipe recipe)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.recipe = recipe;
    }
    
    public static void fillLists()
    {
        names.add(PlantTypes.BOK_CHOY);
        names.add(PlantTypes.ONIONS);
        names.add(PlantTypes.PARSNIPS);
        names.add(PlantTypes.SCALLIONS);
        names.add(PlantTypes.SHALLOTS);
        names.add(PlantTypes.TURNIPS);
        names.add(PlantTypes.ZUCCHINI);
        
        quantities.add(100);
        quantities.add(500);
        quantities.add(1000);
        quantities.add(5000);
        quantities.add(10000);
    }
    
    public static Order generateOrder(IRecipeCRUD crud)
    {
        if(names == null || quantities == null)
        {
            fillLists();
        }
        
        int tId = random.nextInt(10000) + 1;
        String tName = names.get(random.nextInt(names.size())).name();
        int tQuantity = quantities.get(random.nextInt(quantities.size()));
        
        return new Order(tId, tName, tQuantity, crud.getRecipe(tName));
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Order ID: ").append(id).append("\n");
        sb.append("Plant:\t").append(name).append("\n");
        sb.append("Quantity: ").append(quantity).append("\n");
        sb.append("Recipe: ").append(recipe.getId()).append(", ").append(recipe.getName()).append("\n");
        
        return sb.toString();
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.recipe);
        hash = 23 * hash + this.id;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.quantity;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Order other = (Order) obj;
        if (!Objects.equals(this.recipe, other.recipe))
        {
            return false;
        }
        if (this.id != other.id)
        {
            return false;
        }
        if (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        if (this.quantity != other.quantity)
        {
            return false;
        }
        return true;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }
    
    public Recipe getRecipe()
    {
        return recipe;
    }
}
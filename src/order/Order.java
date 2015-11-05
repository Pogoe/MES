package order;

import crud.CRUD;
import crud.IMesCRUD;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Order
{
    private static List<PlantTypes> names = new ArrayList<>();
    private static List<Integer> quantities = new ArrayList<>();
    private static Random random = new Random();
    private IMesCRUD crud = CRUD.get();
    private Recipe recipe;
    private int id;
    private String name;
    private int quantity;
    
    public Order(int id, String name, int quantity)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        setRecipe();
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
    
    public static Order generateOrder()
    {
        int tId = random.nextInt();
        String tName = names.get(random.nextInt(names.size())).name();
        int tQuantity = quantities.get(random.nextInt(quantities.size()));
        
        return new Order(tId, tName, tQuantity);
    }
    
    private void setRecipe()
    {
        recipe = new Recipe(1, "Opskrift til denne grøntsag", 3, 4, 5, 6, 7, 8, 9, 10, 11);
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
}
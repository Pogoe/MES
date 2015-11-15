package Controller;

import crud.RecipeCRUD;
import crud.IRecipeCRUD;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import order.Order;

public class MESController
{
    private IRecipeCRUD crud = RecipeCRUD.get();
    private IMesReciever server;
    
    public void connect()
    {
        try
        {
            server = (IMesReciever) LocateRegistry.getRegistry("localhost", 7000).lookup("SCADA");
        } catch (RemoteException ex)
        {
            System.err.println("Remote coomunication error: " + ex);
        } catch (NotBoundException ex)
        {
            System.err.println("Unable to bind object: " + ex);
        }
    }
    
    public Order makeOrder()
    {
        Order o = Order.generateOrder(crud);
        System.out.println("\nRecieved order: ");
        System.out.println(o.toString());
        
        return o;
    }
}

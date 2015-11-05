package Controller;

import Client.SCADAClient;
import order.Order;

public class MESController
{
    public static void main(String[] args)
    {
        Order.fillLists();
        Order o = Order.generateOrder();
        System.out.println("\nRecieved order: ");
        System.out.println(o.toString());
        SCADAClient client = new SCADAClient();
        client.executeOrder(o);
    }
}

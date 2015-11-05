package Client;

import order.Order;

public class SCADAClient
{
    private MesServerImplService service;
    private IMesServer server;
    
    public SCADAClient()
    {
        service = new MesServerImplService();
        server = service.getMesServerImplPort();
    }
    
    public void storeOrder(Order order)
    {
        server.storeOrder(order.toString());
    }
    
    public void executeOrder(Order order)
    {
        server.executeOrder(order.toString());
    }
}

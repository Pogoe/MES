package Client;

public class SCADAClient
{
    private MesServerImplService service;
    private IMesServer server;
    
    public void connect()
    {
        service = new MesServerImplService();
        server = service.getMesServerImplPort();
    }
    
    public void storeTask()
    {
        server.storeTask();
    }
}

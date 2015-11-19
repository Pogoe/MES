package Controller;

import data.BatchError;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import order.Order;

public class MesRecieverImpl implements IMesReciever
{
    private MESController controller = new MESController();
    
    public MesRecieverImpl()
    {
        this.controller.connect();
    }
    
    @Override
    public boolean queueOrder(Order o) throws RemoteException
    {
        return controller.getServer().queueOrder(o);
    }

    @Override
    public List<BatchError> getDailyErrors(Date from, Date to) throws RemoteException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaxCapacity() throws RemoteException
    {
        return controller.getServer().getMaxCapacity();
    }

    @Override
    public Map<String, Integer> getCurrentCapacity(Order o) throws RemoteException
    {
        return controller.getServer().getCurrentCapacity(o);
    }

    @Override
    public int getRemovedUnits(Order o) throws RemoteException
    {
        return controller.getServer().getRemovedUnits(o);
    }
}

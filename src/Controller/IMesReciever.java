package Controller;

import data.BatchError;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import order.Order;

public interface IMesReciever extends Remote
{
    boolean queueOrder(Order o) throws RemoteException;
    List<BatchError> getDailyErrors(Date from, Date to) throws RemoteException;
    int getMaxCapacity() throws RemoteException;
    Map<String, Integer> getCurrentCapacity(Order o) throws RemoteException;
    int getRemovedUnits(Order o) throws RemoteException;
}

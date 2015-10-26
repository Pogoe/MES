/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reciever;

import Controller.Order;

/**
 *
 * @author User1
 */
public class ERPReciever
{
    Order order;
    
    public ERPReciever()
    {
        order = new Order();
    }
    
    public Order waitForOrder()
    {
        while (order == null)
        {
            
        }
        
        return order;
    }
    
    public Order getRecipe(Order order)
    {
        
        return order;
    }
    
    public void executeOrder();
    {
        
    }
}

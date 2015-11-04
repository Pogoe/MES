package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ErpCRUD
{
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement ps;
    private static ErpCRUD instance;
    
    public ErpCRUD()
    {
        connect();
    }
    
    public static ErpCRUD get()
    {
        if(instance == null)
        {
            instance = new ErpCRUD();
        }
        
        return instance;
    }
    
    private void connect()
    {
        try
        {
            String connectionUrl = "jdbc:sqlserver://10.137.0.21:1433;databaseName=Dynamics09;user=AXReader;password=AXReader";
            Class.forName(connectionUrl);
            conn = DriverManager.getConnection(connectionUrl);
            ps = conn.prepareStatement("SELECT * FROM prodtable");
        } catch (ClassNotFoundException | SQLException ex)
        {
            System.err.println(ex);
        }
    }
    
    public void getNextOrder()
    {
        try
        {
            if(rs == null)
            {
                rs = ps.executeQuery();
            }
            
            if(rs.next())
            {
                //Lav jeres ordre her, og send den videre
            }
        } catch (SQLException ex)
        {
            System.err.println(ex);
        }
    }
}
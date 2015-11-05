package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import order.Recipe;

public class CRUD implements IMesCRUD
{
    public static CRUD instance;
    private Connection conn;

    private CRUD()
    {
        connect();
    }
    
    public static CRUD get()
    {
        if(instance == null)
        {
            instance = new CRUD();
        }
        return instance;
    }

    private void connect()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/Semesterprojekt";
            String user = "postgres";
            String pass = "u7e98d22";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex)
        {
            System.err.println(ex);
        }
    }
    
    @Override
    public Recipe getRecipe(String name)
    {
        Recipe r = null;
        
        try
        {
            String query = "SELECT * FROM Recipe WHERE name == " + name + ";";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next())
            {
                r = new Recipe(rs.getInt(1), rs.getString(2), rs.getInt(3),
                        rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),
                        rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11));
                return r;
            }
        } catch (SQLException ex)
        {
            System.err.println(ex);
        }
        
        return r;
    }
}

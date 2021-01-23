/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postal.code.finder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author pankul
 */
public class PostalCodeFinder {
static Connection con;
    public PostalCodeFinder()
    {
         try
        {
            
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/postinfo","root","");
        Statement st = con. createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
        {
             System.out.println(e);           
        }
         
    }
    protected  static void home_page()
    {
        try
        {
            new Home_Page().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    new PostalCodeFinder();
    home_page();
    }
    
}

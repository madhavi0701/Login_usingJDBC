/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc1;
import java.sql.*;
/**
 *
 * @author admin
 */
public class Jdbc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login lgn=new Login();
        lgn.setVisible(true);
    }
    public static Statement connect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
            Statement st=con.createStatement();
            return st;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
}

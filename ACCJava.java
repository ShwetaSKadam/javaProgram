/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell
 */
public class ACCJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
         try{
             Connection conn = null;
             Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/acc1","root","");
            System.out.println("Connection is successful");
            
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("insert into newdatabase values ('sahil','wfh123','UK',64);");
            System.out.println("Record inserted successfully");
            stmt.close();
      
            conn.close();
           
            
        }catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    }
    

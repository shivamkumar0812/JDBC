/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.sql.*;

public class JDBC_Selector {
    public static void main(String[] args) {
        System.out.println("This is a Selector program");
        try {
            //Creating a connection
            Connection con = ConnectionProvider.getConnection();
            
            //Creating a query, and a statement.
            
            String q = "select * from msm";
            
            //Creating a normal statement;
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(q);
            
            //Processing the data
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println(id + " : " + name);
                

            }
            
            //Close the connection
            con.close();           
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

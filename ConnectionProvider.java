/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    
        private static Connection con;
        
        public static Connection getConnection(){
            
            try {
                //Creating a connection.
                if(con==null){
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/students";
                    String user = "root";
                    String password = "your_mysql_password";
                     con = DriverManager.getConnection(url,user,password);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            return con;
        }
        
        
    
    
}

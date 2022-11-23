
package javaapplication1;

import java.io.*;
import java.sql.*;
public class Insert_JDBC {
    public static void main(String[] args) {
        try {
             //1. Creating a connection
        Connection con = ConnectionProvider.getConnection();
        
        //Creating a query and prepared statement.
        String q = "insert into msm(studentId, studentName) values(?,?)";
        
        //Creating a bufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter student id: ");
        int studentId = Integer.parseInt(br.readLine());
        System.out.println("Enter student name");
        String studentName = br.readLine();
        
        //Creating a prepared Statement.
        PreparedStatement pstmt = con.prepareStatement(q);
        
        pstmt.setInt(1, studentId);
        pstmt.setString(2, studentName);
        
        pstmt.executeUpdate();
        
        System.out.println("Inserted...");
        
        //Close the connection
        con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        
    }
    
}

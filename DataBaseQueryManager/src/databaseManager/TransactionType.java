package databaseManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionType {
   static final String DB_URL = "jdbc:mysql://localhost";
   static final String USER = "guest";
   static final String PASS = "guest123";
private static final String QUERY = null;

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query to INSERT a record
         System.out.println("Inserting records into the table...");          
         String sql = "INSERT INTO TransactionType VALUES ('C', 'credit', )";
         stmt.executeUpdate(sql);
         
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
         // Execute a query to DELETE a record
         try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                 Statement stmt = conn.createStatement();
              ) {		      
                 String sql = "DELETE FROM TransactionType " +
                    "WHERE VALUES = ('C', 'credit', )";
                 stmt.executeUpdate(sql);
                 ResultSet rs = stmt.executeQuery(QUERY);
                 rs.close();
              } catch (SQLException e1)
         
         {
    	     // Execute a query to UPDATE the table
    	      try(Connection conn1 = DriverManager.getConnection(DB_URL, USER, PASS);
    	         Statement stmt1 = conn1.createStatement();
    	      ) {		      
    	         String sql = "UPDATE Account " +
    	            "SET C = credit ";
    	         stmt1.executeUpdate(sql);
    	         ResultSet rs = stmt1.executeQuery(QUERY);
    	         rs.close();
    	      } catch (SQLException e11) {
         e11.printStackTrace();
      } 
   }
         
      } 
   }
}
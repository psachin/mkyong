
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlConn {
	 public static void main(String args[]) {
	        String dbURL = "jdbc:mysql://10.101.30.27:3306/rt";
	        String username ="sachin";
	        String password = "sachin";
	       
	        Connection dbCon = null;
	        Statement stmt = null;
	        ResultSet rs = null;
	       
	        String query ="select * from register_complaint";
	       
	        try {
	            //getting database connection to MySQL server
	            dbCon = DriverManager.getConnection(dbURL, username, password);
	           
	            //getting PreparedStatment to execute query
	            stmt = dbCon.prepareStatement(query);
	           
	            //Resultset returned by query
	            rs = stmt.executeQuery(query);
	           
	            while(rs.next()){
	             int count = rs.getInt(1);
	             String counts = rs.getString(6);
	             System.out.println("count of stock : " + count + "  " +counts);
	            }
	           
	        } catch (Exception ex) {
	        	System.out.println("ERROR is"+ex.getMessage().toString() );
	            //Logger.getLogger(CollectionTest.class.getName()).log(Level.SEVERE, null, ex);
	        } finally{
	           //close connection ,stmt and resultset here
	        }
	       
	    }  
}

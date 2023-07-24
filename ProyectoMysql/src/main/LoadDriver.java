package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class LoadDriver {
	Connection conn = null;

   
    public Connection conexion() {
    	
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    	    conn =
    	       DriverManager.getConnection("jdbc:mysql://localhost/instituto?" +
    	                                   "user=root&password=");

    	    

    	   
    	} catch (SQLException ex) {
    	    // handle any errors
    	    System.out.println("SQLException: " + ex.getMessage());
    	    System.out.println("SQLState: " + ex.getSQLState());
    	    System.out.println("VendorError: " + ex.getErrorCode());
    	}catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    	return conn;
    }
}

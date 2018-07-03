package designing;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connecting_Drivers 
{
	public static Connection getOracleConnection() 
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "lit");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	

}

package utility;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;
import java.io.InputStream;


public class ConnectionManager {
	
	public static Connection getConnection() throws Exception
	{
		Properties prop= null;
		
		prop = loadPropertiesFile();
		final String driver = prop.getProperty("driver");
		final String url = prop.getProperty("url");
		final String name = prop.getProperty("username");
		final String pass = prop.getProperty("password");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(name);
		System.out.println(pass);
		Class.forName(driver);
		Connection ob=null;
		ob=DriverManager.getConnection(url,name,pass);
		return ob;
	}
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
}

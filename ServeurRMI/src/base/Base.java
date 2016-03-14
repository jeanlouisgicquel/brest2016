package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Base {
	
	String config = "prop"; // fichier config
	
	String url = null;
	String user = null;
	String passwd = null;
	
	Connection co = null;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver").
				newInstance();
		}
		catch (Exception e) {
			System.out.println("erreur Class.forName");
		}
	}


	public void ouvrir() {
		ResourceBundle rb = ResourceBundle.getBundle(config);
		url = rb.getString("url");
		user = rb.getString("user");
		passwd = rb.getString("passwd");
		System.out.println("url = "+url);
		System.out.println("user = "+user);
		
		try {
			co = DriverManager.getConnection(url, user, passwd);
			System.out.println("Base.ouvrir "+url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("erreur Base.ouvrir "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void fermer() {
		if (co != null) 
			try {co.close();}catch(Exception e){}
	}
	
	
}

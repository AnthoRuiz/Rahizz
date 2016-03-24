package models.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToDB {
	
	private final	String NAMEDB = "diana";
	private final String USER = "root";
	private final String PASS = "";
	private final String URL = "jdbc:mysql://localhost:3306/" + NAMEDB;
	
	Connection con = null;
	
	//Constructor de la clase
	
	public ConnectionToDB(){
		
	try {
			//obtener el driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//obtener la conexion
			con = DriverManager.getConnection(URL, USER, PASS);
			
			if (con != null){
				//System.out.println("Conexion Exitosa a la BD: " + NAMEDB);
			}
		}catch (ClassNotFoundException e) {
			System.out.println("Ocurrio un ClassNotFoundException:  " + e.getMessage());
		}catch (SQLException e) {
			System.out.println("Ocurrio un SQLException:  " + e.getMessage());
		}
	}
	
	public Connection getConnection(){
		return this.con;
	}
	
	public void close(){
		con =  null;
	}

}
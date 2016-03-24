package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import models.Employe;
import models.connection.ConnectionToDB;

public class EmployeDAO {
	
	public Employe roleLogin(String pass, String document){
		
		Connection connection = null;
		ConnectionToDB con = new ConnectionToDB();
		PreparedStatement preStatement = null;
		ResultSet result = null;
		Employe employe = new Employe();
		
		connection = con.getConnection();
		
		String query = "SELECT * FROM employes where pass = ? AND document = ?";
		
		try {
			preStatement = connection.prepareStatement(query);
			preStatement.setString(1,pass);
			preStatement.setString(2,document);
			
			result = preStatement.executeQuery();
			employe.setDocument(document);
			employe.setPass(pass);
			while (result.next()) {
				
				employe.setName(result.getString("name"));
				employe.setRole(result.getString("role"));
			}
				
		} catch (SQLException e) {
			System.out.println("SQLException en la consulta: " + e.getMessage());
		}
		
		return employe;
		
	}
}

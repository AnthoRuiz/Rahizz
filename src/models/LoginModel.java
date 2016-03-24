package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.connection.ConnectionToDB;

public class LoginModel {


	public String login(int i, String role) {
		return validarLogin(i, role);
	}
	
	private String validarLogin(int i, String pass) {
		String role = "";
		String res = "error";
		Connection connetion = null;
		ConnectionToDB myConnetion = new ConnectionToDB();
		PreparedStatement statement = null;
		ResultSet result = null;
		
		connetion = myConnetion.getConnection();
		
		if(i == 0){
			role =  "administrador";
		}else{
			role =  "operador";
		}
		
		String query = "SELECT * FROM roles where pass = ? AND role = ?";
		
		try {
			statement = connetion.prepareStatement(query);
			statement.setString(1, pass);
			
			statement.setString(2, role);
			
			result = statement.executeQuery();
			
			while (result.next()) {
				if(result.getString("role").equals("administrador")){
					res = "admin";
				}else{
					res =  "operador";
				}
			}
			statement.close();
		} catch (SQLException e) {
			System.out.println("SQLException en la Consulta: " + e.getMessage());
			res = "errorQuery";
		}
		return res;
	}

}

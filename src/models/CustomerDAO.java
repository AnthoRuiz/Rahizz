package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.connection.ConnectionToDB;

public class CustomerDAO {

	public String registUser(Customer customer) {
		
		Connection connection = null;
		ConnectionToDB con = new ConnectionToDB();
		PreparedStatement preStatement = null;
		String result = null;
		
		connection = con.getConnection();
		
		String query = "INSERT INTO customers (name, document, cel, date, gender, email, pago_CxC)"
				+ "VALUES (?,?,?,?,?,?,?)";
		
		try {
			preStatement = connection.prepareStatement(query);
			
			preStatement.setString(1, customer.getName());
			preStatement.setString(2, customer.getDocument());
			preStatement.setString(3, customer.getCel());
			preStatement.setString(4, customer.getDate());
			preStatement.setString(5, customer.getGender());
			preStatement.setString(6, customer.getEmail());
			preStatement.setString(7, customer.getPagoCxC());
			
			preStatement.execute();
			
			result = "ok";		
			
		} catch (SQLException e) {
			System.out.println("SQLException en la consulta: " + e.getMessage());
			result = "error";
		}
		return result ;
	}

}



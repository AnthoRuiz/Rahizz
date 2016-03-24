package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.connection.ConnectionToDB;

public class ProductDAO {

	//private static DefaultTableModel modelTableStock = new DefaultTableModel();
	//private static JTable tableStock = new JTable();

	public static String registProduct(Product product) {
		
		Connection connection = null;
		ConnectionToDB con = new ConnectionToDB();
		PreparedStatement preStatement = null;
		String result = null;
		
		connection = con.getConnection();
		
		String query = "INSERT INTO products (cod_ref, cost_price, sell_price, description, date_add, count)"
				+ "VALUES (?,?,?,?,?,?)";
		
		try {
			preStatement = connection.prepareStatement(query);
			
			preStatement.setString(1, product.getCodRef());
			preStatement.setString(2, product.getCostPrice());
			preStatement.setString(3, product.getSellPrice());
			preStatement.setString(4, product.getDescription());
			preStatement.setString(5, product.getDateAdd());
			preStatement.setInt(6, product.getCount());
			
			preStatement.execute();
			
			result = "ok";		
			
		} catch (SQLException e) {
			System.out.println("SQLException en la consulta: " + e.getMessage());
			result = "error";
		}
		return result ;
	}
	
	public static void findProduct(String text, DefaultTableModel modelTableStock, JTable tableConsStock){
			
		Connection connection = null;
		ConnectionToDB con = new ConnectionToDB();
		PreparedStatement preStatement = null;
		String [] row = new String[7];
		String [] titles = {"Referencia", "Descripcion", "Precio de Costo", "Precio de Venta", "Fecha de Compra", "Cantidad"};
		connection = con.getConnection();
		modelTableStock = new DefaultTableModel(null, titles);
		String filter = ""+text+"_%";
		String query = "SELECT * FROM products WHERE cod_ref LIKE "+'"'+filter+'"';
		//System.out.println(query);
		try {
			preStatement = connection.prepareStatement(query);
			ResultSet rs = preStatement.executeQuery(query);
			
			while (rs.next()) {
				row[0] = rs.getString("cod_ref");
				row[1] = rs.getString("cost_price");
				row[2] = rs.getString("sell_price");
				row[3] = rs.getString("description");
				row[4] = rs.getString("date_add");
				row[5] = rs.getString("count");
				modelTableStock.addRow(row);
			}
			tableConsStock.setModel(modelTableStock);
			rs.close();
			preStatement.close();
		
		} catch (SQLException e) {
			System.out.println("SQLException en la consulta: " + e.getMessage());
		}
		
	}

	public static void loadTabbleStock(DefaultTableModel modelTableStock) {
		Connection connection = null;
		ConnectionToDB con = new ConnectionToDB();
		PreparedStatement preStatement = null;
		String [] row = new String[7];
		
		connection = con.getConnection();
		String query = "SELECT *FROM products ORDER BY cod_ref";
		
		try {
			preStatement = connection.prepareStatement(query);
			ResultSet rs = preStatement.executeQuery(query);
			
			while (rs.next()) {
				row[0] = rs.getString("cod_ref");
				row[1] = rs.getString("cost_price");
				row[2] = rs.getString("sell_price");
				row[3] = rs.getString("description");
				row[4] = rs.getString("date_add");
				row[5] = rs.getString("count");
				modelTableStock.addRow(row);

			}
			
			rs.close();
			preStatement.close();
			
			//preStatement.execute();
	
			
		} catch (SQLException e) {
			System.out.println("SQLException en la consulta: " + e.getMessage());
		}
		
	}
	

}

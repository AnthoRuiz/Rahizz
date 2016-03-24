package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import models.connection.ConnectionToDB;

public class DiagnosticDAO {

	public static String addDiagnostic(Diagnostic diagnostic, String customerDocument) {
		Connection connection = null;
		ConnectionToDB con = new ConnectionToDB();
		PreparedStatement preStatementDiag = null;
		String result = null;

		connection = con.getConnection();

		String queryDiag = "INSERT INTO records (doc_customer, stylist_name, hair_structure, white_hair, natural_tone, wanted_tone, tec_mixing, tec_app, post_paint)"
				+ "VALUES (?,?,?,?,?,?,?,?,?)";

		try {
			
			preStatementDiag = connection.prepareStatement(queryDiag);
			
			preStatementDiag.setString(1, customerDocument);
			preStatementDiag.setString(2, diagnostic.getStylistName());
			preStatementDiag.setString(3, diagnostic.getHairStructure());
			preStatementDiag.setString(4, diagnostic.getWhiteHair());
			preStatementDiag.setString(5, diagnostic.getNaturalTone());
			preStatementDiag.setString(6, diagnostic.getWantedTone());
			preStatementDiag.setString(7, diagnostic.getTecMixing());
			preStatementDiag.setString(8, diagnostic.getTecApp());
			preStatementDiag.setString(9, diagnostic.getPostPaint());
			
			preStatementDiag.execute();
			
			result = "ok";		
			
		} catch (SQLException e) {
			System.out.println("SQLException en la consulta: " + e.getMessage());
			result = "error";
		}
			return result ;
		}
}
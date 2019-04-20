package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		//String url = "jdbc:mysql://localhost/livraria?useTimezone=true&serverTimezone=UTC"; // Erro hor�rio de ver�o
		String url = "jdbc:mysql://localhost/livraria";

		try {
			return DriverManager.getConnection(url, "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Testando conex�o com banco de dados
	/*
	public static void main(String[] args) throws SQLException {
		Connection conn = new ConnectionFactory().getConnection();
		System.out.println("Conex�o aberta!");
		conn.close();
	}
	*/
}

package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {
	
	private static final String username = "root";
	
	private static final String password = "";
	
	private static final String database_URL = "jdbc:mysql://localhost";
	
	private static final String DriverMySQL = "com.mysql.cj.jdbc.Driver";
	

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = null;
		
		try {
			Class.forName(DriverMySQL);
			conexao = DriverManager.getConnection(database_URL, username, password);
	    }
		catch (ClassNotFoundException ex) {
			System.out.println("Driver do banco de Dados não localizado.");
		} 

		catch (SQLException ex) {
			System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
		}
		finally {
			if(conexao!= null) {
				conexao.close();
			}
		}

	}
}

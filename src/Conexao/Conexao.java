package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = null;

		String URL = "jdbc:mysql://localhost";
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(URL, user, password);
			System.out.println("Funcionoucarajo");
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

package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;



public class Conexao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = null;

		String URL = "jdbc:mysql://localhost";
		String user = "root";
		String password = "";
		String criaTabela = " Create table DataBase (nome varchar(30));";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexao = DriverManager.getConnection(URL, user, password);
			Statement stnt = (Statement) conexao.createStatement();
			stnt.execute(criaTabela);
			((Connection) stnt).close();
	    }
		catch (ClassNotFoundException ex) {
			System.out.println("Driver do banco de Dados não localizado.");
			ex.printStackTrace();
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

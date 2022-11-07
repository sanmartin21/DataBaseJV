package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {
	
	private static final String username = "root";
	
	private static final String password = "";
	
	private static final String database_URL = "jdbc:mysql://localhost";
	
	private static final String DriverMySQL = "com.mysql.cj.jdbc.Driver";
	

	/*
	 * Conexão com o Banco de Dados
	 */
	
	public static Connection createConnectionToMySQL() throws Exception{
		//faz com que a classe seja carregada pela JVM
		Connection conexao = null;
		
		Class.forName(DriverMySQL);
		
		//cria a conexão com o banco de dados
		conexao = DriverManager.getConnection(database_URL, username, password);
    
		return conexao;
	}
	
	public static void main(String[] args) throws Exception {
		Connection conexao = null;
		
		try {
			//recupera uma conexão com o banco de dados
			conexao = createConnectionToMySQL();
			System.out.println("Conexão obtida com sucesso!");
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

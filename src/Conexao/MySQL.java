package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import EstruturaDataBase.Conexao;

/**
 * Classe que estender� a Conex�o e servir� para fazer a conex�o do MySQL
 * 
 * @author jvsanmartin@yahoo.com.br
 * 
 **/

public class MySQL extends Conexao{
	
	private static String username = "root";
	
	private static String password = "";
	
	private static String database_URL = "jdbc:mysql://localhost/databasejv";
	
	private static String DriverMySQL = "com.mysql.cj.jdbc.Driver";
	
	public MySQL (String usuario, String senha, String url) {
		this.username = usuario;
		this.password  = senha;
		this.database_URL = url;
	}
	

	/**
	 * M�todo que far� a cria��o da conex�o com o banco de dados
	 * 
	 * @author jvsanmartin@yahoo.com.br
	 * 
	 **/
	
	public static Connection createConnectionToMySQL() throws Exception{
	
		/**
		 * M�todo que far� com que a classe seja carregada pela JVM
		 * 
		 * @author jvsanmartin@yahoo.com.br
		 * 
		 **/
		Connection conexao = null;
		
		Class.forName(DriverMySQL);
		
		conexao = DriverManager.getConnection(database_URL, username, password);
    
		return conexao;
	}
	
	public static void main(String[] args) throws Exception {
		Connection conexao = null;
		
		try {
			/**
			 * M�todo que far� com que a cria��o da conex�o com o banco de dados seja recuperada
			 * 
			 * @author jvsanmartin@yahoo.com.br
			 * 
			 **/
			conexao = createConnectionToMySQL();
			System.out.println("Conex�o obtida com sucesso!");
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Driver do banco de Dados n�o localizado.");
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
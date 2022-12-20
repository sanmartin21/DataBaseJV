package ManipulaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Conexao.ConnectionFactory;
import EstruturaDataBase.Coluna;

public class ManipulaBD {
	
	
	public void save(String sql) {
		
		Connection conexao = null;
	
		PreparedStatement pstm = null;
	
		try {
			//Cria uma conexão com o banco de dados
			conexao = ConnectionFactory.createConnectionToMySQL();
		
			//cria um PrepareStatement, para executar a query
		
			pstm = (PreparedStatement) conexao.prepareStatement(sql);

			pstm.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//fechar conexoes
			try {
				if(pstm!= null) {
					pstm.close();
				}
				if(conexao != null) {
					conexao.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
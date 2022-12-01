package ManipulaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Conexao.ConnectionFactory;
import EstruturaDataBase.Coluna;

public class ManipulaBD {
	
	
	public void save(Coluna coluna) {
	
		String sql = "CREATE TABLE database_jv ( pessoa int NOT NULL AUTO_INCREMENT, PRIMARY KEY (pessoa));";
	
		Connection conexao = null;
	
		PreparedStatement pstm = null;
	
		try {
			//Cria uma conex�o com o banco de dados
			conexao = ConnectionFactory.createConnectionToMySQL();
		
			//cria um PrepareStatement, para executar a query
		
			pstm = (PreparedStatement) conexao.prepareStatement(sql);
//			pstm.setString(0, coluna.getNome());
//			pstm.setString(1, coluna.getTipo());
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

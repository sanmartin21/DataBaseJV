package ManipulaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Conexao.MySQL;
import EstruturaDataBase.Coluna;

/**
 * Classe que irá fazer a conexão principal e salvará os dados no banco de dados
 * 
 * @author jvsanmartin@yahoo.com.br
 * 
 **/

public class ManipulaBD {
	
	
	public void save(String sql) {
		
		Connection conexao = null;
		PreparedStatement pstm = null;
	
		try {
			conexao = MySQL.createConnectionToMySQL();
		
			pstm = (PreparedStatement) conexao.prepareStatement(sql);

			pstm.execute();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
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
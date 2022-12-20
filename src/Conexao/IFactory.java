package Conexao;

import ManipulaBD.ManipulaBD;

/**
 * Interface da criação da Conexão
 * 
 * @author jvsanmartin@yahoo.com.br
 * 
 **/

public interface IFactory {
	
	public ManipulaBD createConnection(String usuario, String senha, String url);

}

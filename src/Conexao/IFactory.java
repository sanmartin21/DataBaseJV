package Conexao;

import ManipulaBD.ManipulaBD;

/**
 * Interface da cria��o da Conex�o
 * 
 * @author jvsanmartin@yahoo.com.br
 * 
 **/

public interface IFactory {
	
	public ManipulaBD createConnection(String usuario, String senha, String url);

}

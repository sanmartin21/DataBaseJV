package Conexao;

import ManipulaBD.ManipulaBD;

/**
 * Classe que implementar� a IFactory e ser� a Factory Do MySQL
 * 
 * @author jvsanmartin@yahoo.com.br
 * 
 **/

public class MySQLFactory implements IFactory {

	@Override
	public ManipulaBD createConnection(String usuario, String senha, String url) {
		
		return new ManipulaBD();
	}

}

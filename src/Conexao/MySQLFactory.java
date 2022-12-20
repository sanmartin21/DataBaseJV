package Conexao;

import ManipulaBD.ManipulaBD;

/**
 * Classe que implementará a IFactory e será a Factory Do MySQL
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

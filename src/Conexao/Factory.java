package Conexao;

import ManipulaBD.ManipulaBD;


/**
 * Classe Factory que ir� instanciar a Classe MySQLFactory e sua conex�o caso o sgbd do JSON seja 1
 * 
 * @author jvsanmartin@yahoo.com.br
 * 
 **/

public class Factory{

	public ManipulaBD createConnection(int sgbd, String usuario, String senha, String url) {
		
		if (sgbd == 1) {
			MySQLFactory f = new MySQLFactory();
			return f.createConnection(usuario, senha, url);
		}
		return null;
	}

}

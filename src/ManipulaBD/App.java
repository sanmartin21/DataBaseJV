package ManipulaBD;

import java.io.IOException;

import Conexao.Factory;
import EstruturaDataBase.Conexao;
import EstruturaDataBase.DataBase;
import PopulaJSON.Json;


/**
 * Classe que irá executar o projeto
 * 
 * @author jvsanmartin@yahoo.com.br
 * 
 **/


public class App {

	public static void main(String[] args) throws IOException {
		
		Json json = new Json();
		DataBase dataBase = json.mapeamentoDatabase(); 
		Conexao conexao = json.mapeamento();
		
		Factory factory = new Factory();		
		ManipulaBD bd = factory.createConnection(conexao.getSgbd(), conexao.getUsuario(), conexao.getSenha(), conexao.getUrl());
		
		bd.save(dataBase.toQuery());
	}

}
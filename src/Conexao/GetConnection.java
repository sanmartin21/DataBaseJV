package Conexao;


import java.io.IOException;
import java.sql.*;

import EstruturaDataBase.Conexao;
import PopulaJSON.Json;

public class GetConnection {
	
	public String[] createConnection() throws IOException {

		Conexao conexao = new Json().mapeamento();
		String nome = conexao.getNome();
		String usuario = conexao.getUsuario();
		String senha = conexao.getSenha();

		String urlConnection = "jdbc:mysql://localhost/" + nome;
		String[] array = new String[3];
		
		array[0] = urlConnection;
		array[1] = usuario;
		array[2] = senha;

		return array;
	}
}
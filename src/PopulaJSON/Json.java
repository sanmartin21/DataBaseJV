package PopulaJSON;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import EstruturaDataBase.Coluna;
import EstruturaDataBase.Conexao;
import EstruturaDataBase.DataBase;
import EstruturaDataBase.Tabela;

import com.google.gson.*;


public class Json {
	
	public JsonObject generateGson() throws IOException{
		
		
		BufferedReader bufRead = new BufferedReader(new FileReader("jsonTeste.json"));
		
		String readLine;
		
		StringBuilder StringBuilder = new StringBuilder();
		
		while ((readLine = bufRead.readLine()) != null) {
			StringBuilder.append(readLine);
		}
		
		JsonObject jsonObject = new Gson().fromJson(StringBuilder.toString(), JsonObject.class);
		
		return jsonObject;
	}
	
	
	public Conexao mapeamento() throws IOException{
		
		
		JsonObject jsonObject = this.generateGson();
		
		
		// Populando Conexão do DataBase
		
		Conexao conexao = new Conexao();
		
		conexao.setNome(jsonObject.get("nome").getAsString());
		conexao.setUrl(jsonObject.get("url").getAsString());
		conexao.setPorta(jsonObject.get("porta").getAsInt());
		conexao.setUsuario(jsonObject.get("usuario").getAsString());
		conexao.setSenha(jsonObject.get("senha").getAsString());
		conexao.setSgbd(jsonObject.get("sgbd").getAsInt());
		

		return conexao;
	}
	
	public DataBase mapeamentoDatabase() throws IOException{
		
		JsonObject jsonObject = this.generateGson();
		
		
		// Populando DataBase
		DataBase dataBase = new DataBase();
		
		dataBase.setNome(jsonObject.get("nome").getAsString());
		
		// Populando Array de Tabelas
		
		
		JsonArray arrayTabelas = jsonObject.getAsJsonArray("tabela");
		ArrayList<Tabela> listTabela = new ArrayList<Tabela>();
		
		for(int i = 0; i < arrayTabelas.size(); i++) {
				Tabela tabela = new Tabela();
				tabela.setNomeTabela(arrayTabelas.get(i).getAsJsonObject().get("nomeTabela").getAsString());
				JsonArray arrayColunas = arrayTabelas.get(i).getAsJsonObject().getAsJsonArray("coluna");
				
				// Populando Array de Colunas
				
				ArrayList<Coluna> listColuna = new ArrayList<Coluna>();				
				
				for(int j = 0; j < arrayColunas.size(); j++) {
					
					Coluna coluna = new Coluna();
					
					coluna.setNome(arrayColunas.get(j).getAsJsonObject().get("nome").getAsString());
					coluna.setTipo(arrayColunas.get(j).getAsJsonObject().get("tipo").getAsString());
					coluna.setNotNull(arrayColunas.get(j).getAsJsonObject().get("isNotNull").getAsBoolean());
					coluna.setAutoIncrement(arrayColunas.get(j).getAsJsonObject().get("isAutoIncrement").getAsBoolean());
					coluna.setPrimaryKey(arrayColunas.get(j).getAsJsonObject().get("isPrimaryKey").getAsBoolean());

					listColuna.add(coluna);
				}
				tabela.setColuna(listColuna);
				listTabela.add(tabela);
			}
		
			dataBase.setTabela(listTabela);
		
		return dataBase;
		
	}
	
}
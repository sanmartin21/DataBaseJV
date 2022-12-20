package EstruturaDataBase;

import java.util.ArrayList;
import java.util.List;


/**
 * Classe que irá gerar a estrutura principal do DataBase e de seus atributos
 * 
 * @author jvsanmartin@yahoo.com.br
 * 
 **/

public class DataBase {
	
	  private String nome;
	  public ArrayList<Tabela> tabela = new ArrayList<Tabela>();
	  
	  
	public DataBase(String nome, List<Tabela> tabelas) {
		setNome(nome);
		setTabela(tabela);
	}
	
	public DataBase() {
	}	

	/**
	 * Método que transformará a classe em uma String SQL
	 * 
	 * @author jvsanmartin@yahoo.com.br
	 * 
	 **/
	
	public String toQuery() {
		String query = "";
		for(Tabela tabela : tabela) {
			query += " " + tabela.toQuery(nome) + ";";
		}
		return query;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Tabela> getTabela() {
		return tabela;
	}
	public void setTabela(ArrayList<Tabela> tabela) {
		this.tabela = tabela;
	}
	
	public void addTabela(Tabela tabela) {
		this.tabela.add(tabela);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataBase [nome=");
		builder.append(nome);
		builder.append(", tabela=");
		builder.append(tabela);
		builder.append("]");
		return builder.toString();
	}
	  
	
	  

}

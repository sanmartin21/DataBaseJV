package EstruturaDataBase;

import java.util.ArrayList;

public class DataBase {
	
	  public String nome;
	  public ArrayList<Tabela> tabela;
	  
	  
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

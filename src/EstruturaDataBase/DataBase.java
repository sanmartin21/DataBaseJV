package EstruturaDataBase;

import java.util.ArrayList;

public class DataBase {
	
	  public String nome;
	  public ArrayList<Tabela> tabelas;
	  
	  
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Tabela> getTabelas() {
		return tabelas;
	}
	public void setTabelas(ArrayList<Tabela> tabelas) {
		this.tabelas = tabelas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataBase [nome=");
		builder.append(nome);
		builder.append(", tabelas=");
		builder.append(tabelas);
		builder.append("]");
		return builder.toString();
	}
	  
	
	  

}

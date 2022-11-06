package EstruturaDataBase;

import java.util.ArrayList;

public class Tabela {
	
	 public String nome;
	 public ArrayList<Coluna> colunas;
	 
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Coluna> getColunas() {
		return colunas;
	}
	public void setColunas(ArrayList<Coluna> colunas) {
		this.colunas = colunas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tabela [nome=");
		builder.append(nome);
		builder.append(", colunas=");
		builder.append(colunas);
		builder.append("]");
		return builder.toString();
	}
	 
	 
	 
	    

}

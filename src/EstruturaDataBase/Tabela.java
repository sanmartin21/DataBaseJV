package EstruturaDataBase;

import java.util.ArrayList;

public class Tabela {
	
	 public String nome;
	 public ArrayList<Coluna> coluna;
	 
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Coluna> getColuna() {
		return coluna;
	}
	public void setColuna(ArrayList<Coluna> coluna) {
		this.coluna = coluna;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tabela [nome=");
		builder.append(nome);
		builder.append(", coluna=");
		builder.append(coluna);
		builder.append("]");
		return builder.toString();
	}
	 
	 
	 
	    

}

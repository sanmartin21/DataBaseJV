package EstruturaDataBase;

import java.util.ArrayList;
import java.util.List;

public class Tabela {
	
	 public String nomeTabela;
	 public ArrayList<Coluna> coluna;
	 
	 
	 public Tabela(String nomeTabela, List<Coluna> colunas) {
		 super();
		 setNomeTabela(nomeTabela);
		 setColuna(coluna);
	 }
	 public Tabela() {
		 
	 }
	 
	 public String toQuery(String nome) {
		 String stmt = "CREATE TABLE " + nome + "." + nomeTabela;
		 
		 stmt += "(";
		 for(Coluna coluna : coluna) {
			 stmt += coluna.getNome() + " " + coluna.getTipo() + ",";  
 		 }
		 stmt = stmt.substring(0, stmt.length() -1);
		 stmt += ")";
		 
		 return stmt;
	 }
	 
	 
	public String getTabelaNome() {
		return nomeTabela;
	}
	public void setNomeTabela(String nomeTabela) {
		this.nomeTabela = nomeTabela;
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
		builder.append("Tabela [nomeTabela=");
		builder.append(nomeTabela);
		builder.append(", coluna=");
		builder.append(coluna);
		builder.append("]");
		return builder.toString();
	}
	
	 
	    

}

package EstruturaDataBase;

public class Coluna {
	 public String nome;
	 public String tipo;
	 private boolean isNotNull;
	 private boolean isAutoIncrement;
	 private boolean isPrimaryKey;
	 
	 
	public Coluna(String name, String tipo) {
		setNome(nome);
		setTipo(tipo);
	}
	 
	public Coluna() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isNotNull() {
		return isNotNull;
	}
	public void setNotNull(boolean isNotNull) {
		this.isNotNull = isNotNull;
	}
	public boolean isAutoIncrement() {
		return isAutoIncrement;
	}
	public void setAutoIncrement(boolean isAutoIncrement) {
		this.isAutoIncrement = isAutoIncrement;
	}
	public boolean isPrimaryKey() {
		return isPrimaryKey;
	}
	public void setPrimaryKey(boolean isPrimaryKey) {
		this.isPrimaryKey = isPrimaryKey;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coluna [nome=");
		builder.append(nome);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", isNotNull=");
		builder.append(isNotNull);
		builder.append(", isAutoIncrement=");
		builder.append(isAutoIncrement);
		builder.append(", isPrimaryKey=");
		builder.append(isPrimaryKey);
		builder.append("]");
		return builder.toString();
	}
	 
	 
	 
	 
	 
	 
}

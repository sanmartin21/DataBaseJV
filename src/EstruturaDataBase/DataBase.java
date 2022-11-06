package EstruturaDataBase;

import java.util.ArrayList;

public class DataBase {
	
	  public String nome;
	  public String url;
	  public String porta;
	  public String usuario;
	  public String senha;
	  public String SGBD;
	  public ArrayList<Tabela> tabelas;
	  
	  
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSGBD() {
		return SGBD;
	}
	public void setSGBD(String sGBD) {
		SGBD = sGBD;
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
		builder.append(", url=");
		builder.append(url);
		builder.append(", porta=");
		builder.append(porta);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", SGBD=");
		builder.append(SGBD);
		builder.append(", tabelas=");
		builder.append(tabelas);
		builder.append("]");
		return builder.toString();
	}
	  
	
	  

}

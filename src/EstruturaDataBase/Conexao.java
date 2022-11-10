package EstruturaDataBase;

public class Conexao {

	private String url;
	private int porta;
	private String usuario;
	private String senha;
	private String sgbd;
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPorta() {
		return porta;
	}
	public void setPorta(int porta) {
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
	public String getSgbd() {
		return sgbd;
	}
	public void setSgbd(String sgbd) {
		this.sgbd = sgbd;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conexao [url=");
		builder.append(url);
		builder.append(", porta=");
		builder.append(porta);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", sgbd=");
		builder.append(sgbd);
		builder.append("]");
		return builder.toString();
	}
		
}

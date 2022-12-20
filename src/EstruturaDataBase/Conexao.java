package EstruturaDataBase;

/**
 * Classe que irá gerar a estrutura da conexao e de seus atributos
 * 
 * @author jvsanmartin@yahoo.com.br
 * 
 **/

public class Conexao{

	protected String nome;
	protected String url;
	protected int porta;
	protected String usuario;
	protected String senha;
	protected int sgbd;
	
	
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
	public int getSgbd() {
		return sgbd;
	}
	public void setSgbd(int sgbd) {
		this.sgbd = sgbd;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conexao [nome=");
		builder.append(nome);
		builder.append(", url=");
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

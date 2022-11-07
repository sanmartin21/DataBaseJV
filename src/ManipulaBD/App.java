package ManipulaBD;

import EstruturaDataBase.Coluna;

public class App {

	public static void main(String[] args) {

		ManipulaBD manipulaBD =  new ManipulaBD();

		Coluna coluna = new Coluna();
		
		coluna.setNome("DataBaseJV");
		coluna.setTipo("int");
		
		manipulaBD.save(coluna);
		
	}

}

package ManipulaBD;

import java.io.IOException;

import EstruturaDataBase.DataBase;
import PopulaJSON.Json;

public class App {

	public static void main(String[] args) throws IOException {
		
		Json json = new Json();
		
		DataBase dataBase = json.mapeamentoDatabase(); 
		
		ManipulaBD bd = new ManipulaBD();
		
		bd.save(dataBase.toQuery());
	}

}
package PopulaJson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import EstruturaDataBase.DataBase;
import com.google.gson.*;


public class Json {
	
	private JsonObject generateGson() throws IOException{
		
		String arquivo = "C:\\Users\\jvsan\\OneDrive\\Área de Trabalho\\DatabaseJV\\jsonTeste";
		
		BufferedReader bufRead = new BufferedReader(new FileReader(arquivo));
		
		String line;
		
		StringBuilder StringBuilder = new StringBuilder();
		
		while ((line = bufRead.readLine()) != null) {
			StringBuilder.append(line);
		}
		
		JsonObject jsonObject = new Gson().fromJson(StringBuilder.toString(), JsonObject.class);
		return jsonObject;
		
	
	public DataBase populaObjeto() throws IOException {
		
		JsonObject gsonObj = this.generateGson();
	}

		
		
	}

}

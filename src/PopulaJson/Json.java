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
		
		String readLine;
		
		StringBuilder StringBuilder = new StringBuilder();
		
		while ((readLine = bufRead.readLine()) != null) {
			StringBuilder.append(readLine);
		}
		
		JsonObject jsonObject = new Gson().fromJson(StringBuilder.toString(), JsonObject.class);
		
	return jsonObject;
		
		
		
	}

}

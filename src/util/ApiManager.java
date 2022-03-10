package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiManager {
	public static String get(String url) {
		URL u;
		try {
			u = new URL(url);
			// Restful Api Methods: GET, POST, PUT, DELETE
			HttpURLConnection connection = (HttpURLConnection) u.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json");
			
			if(connection.getResponseCode() != 200) {
				throw new RuntimeException("Kontakt konnte nicht aufgebaut werden.\n"
						+ "Fehler-Code: " + connection.getResponseCode() + "\n"
						+ "Fehler-Nachricht: " + connection.getResponseMessage());
			}
			
			// Daten entgegen nehmen
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			// Daten verarbeiten (zurück geben)
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

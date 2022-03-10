package services;

import com.google.gson.Gson;

import pojo.Apod;
import util.ApiManager;

public class ApodService {
	private static ApodService instance = new ApodService();
	
	private ApodService() {}
	
	public static ApodService getInstance() {
		return ApodService.instance;
	}
	
	public Apod get(String date) {
		String response = ApiManager.get("https://api.nasa.gov/planetary/apod?api_key=UZod9JcODnZndLuln7PIbzvHL9EM7fdYAgycr42r&date="+date);
		return new Gson().fromJson(response, Apod.class);
	}
}

package threads;

import pojo.Apod;
import services.ApodService;

public class ApodThread extends Thread {
	private ApodService apods;
	private Apod apod;
	private String date;
	
	public ApodService getApods() {
		return apods;
	}

	public void setApods(ApodService apods) {
		this.apods = apods;
	}

	public Apod getApod() {
		return apod;
	}

	public void setApod(Apod apod) {
		this.apod = apod;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public ApodThread(String date) {
		this.apods = ApodService.getInstance();
		this.setApod(new Apod());
		this.setDate(date);
	}
	
	@Override
	public void run() {
		this.setApod(apods.get(this.getDate()));
	}
}

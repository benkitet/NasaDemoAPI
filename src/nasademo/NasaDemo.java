package nasademo;

import threads.ApodThread;

public class NasaDemo {

	public static void main(String[] args) {
		System.out.println("Herzulich Willkommen zum Apod Service der NASA.");
		System.out.println("Ihr Apod wird aufgerufen, bitte warten...");
		
		ApodThread at = new ApodThread("2022-01-01");
		at.start();
		
		try {
			at.join();
			System.out.println(at.getApod());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
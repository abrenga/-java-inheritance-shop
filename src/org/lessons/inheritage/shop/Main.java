package org.lessons.inheritage.shop;

public class Main {
	public static void main(String[] arg) {
		
		int codice= Smartphone.calcolaCodice();
		Smartphone iphone = new Smartphone( codice, "Iphone",  "Apple", 1100, 00000044, "128GB");

		String Smartphone = iphone.toString(); 
		System.out.println(Smartphone);	

	}
	
	
	
	
	
	
}

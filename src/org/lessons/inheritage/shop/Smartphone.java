package org.lessons.inheritage.shop;

import java.util.Random;

public class Smartphone extends Prodotto {
	private String imei;
	private String capacitaMemoria;

	public Smartphone(String nome, String marca, float prezzo, String capacitaMemoria) {
		super(nome, marca, prezzo);
		this.imei = generaImei();
		this.capacitaMemoria = capacitaMemoria;
	}
		
	public String getcapacitaMemoria(String capacitaMemoria) {
		return this.capacitaMemoria;
	}
	
	public void setCapacitaMemoria(String capacitaMemoria) {
		 this.capacitaMemoria = capacitaMemoria;
	}
	
	
	private String generaImei() {
		Random random = new Random();
		int number = random.nextInt(100);
		String str = Integer.toString(number);
		
		int riempiConLoZero = 8 - str.length();
		for (int i = 0; i < riempiConLoZero; i++) {
			str = "0" + str;
		}
		
		return str;

	}
		
	
	@Override
	public String toString() {
		
		String p= super.toString() + ", codice IMEI:  " + this.imei + ", capacità della memoria:  " + this.capacitaMemoria;
		return p;
	}
	

}

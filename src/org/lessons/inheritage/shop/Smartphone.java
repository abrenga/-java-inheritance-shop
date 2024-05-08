package org.lessons.inheritage.shop;

public class Smartphone extends Prodotto {
	private long imei;
	private String capacitaMemoria;

	public Smartphone(int codice, String nome, String marca, float prezzo, long imei, String capacitaMemoria) {
		super(codice, nome, marca, prezzo);
		this.imei = imei;
		this.capacitaMemoria = capacitaMemoria;
	}
	
	
	public long getImei() {
		return this.imei;
	}
	
	
	public String getcapacitaMemoria(String capacitaMemoria) {
		return this.capacitaMemoria;
	}
	
	public void setCapacitaMemoria(String capacitaMemoria) {
		 this.capacitaMemoria = capacitaMemoria;
	}
	
	
	
	public String toString() {
		
		String p= super.toString() + ", codice IMEI:  " + this.imei + ", capacità della memoria:  " + this.capacitaMemoria;
		return p;
	}
	

}

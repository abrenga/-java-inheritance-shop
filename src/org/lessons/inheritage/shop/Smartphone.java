package org.lessons.inheritage.shop;

public class Smartphone extends Prodotto {
	private long imei;
	private String capacitaMemoria;

	public Smartphone(int codice, String nome, String marca, float prezzo, long imei, String capacitaMemoria) {
		super(codice, nome, marca, prezzo);
		this.imei = imei;
		this.capacitaMemoria = capacitaMemoria;
	}

}

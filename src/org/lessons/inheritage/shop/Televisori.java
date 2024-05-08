package org.lessons.inheritage.shop;

public class Televisori extends Prodotto{
	private String dimensioni;
	private Boolean smart;

	public Televisori(int codice, String nome, String marca, float prezzo, String dimensioni, Boolean smart) {
		super(codice, nome, marca, prezzo);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}

}

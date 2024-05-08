package org.lessons.inheritage.shop;

public class Cuffie extends Prodotto{
	private String colore;
	private Boolean tipo;
	
	
	public Cuffie(int codice, String nome, String marca, float prezzo, String colore, Boolean tipo) {
		super(codice, nome, marca, prezzo);
		this.colore = colore;
		this.tipo = tipo;
	}
}

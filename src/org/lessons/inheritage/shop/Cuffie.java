package org.lessons.inheritage.shop;

public class Cuffie extends Prodotto {
	private String colore;
	private String tipo;

	public Cuffie(String nome, String marca, float prezzo, String colore, String tipo) {
		super(nome, marca, prezzo);
		this.colore = colore;
		this.tipo = tipo;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "di colore: " + colore + "tipo di cuffie: " + tipo;
	}

}

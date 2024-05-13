package org.lessons.inheritage.shop;

public class Televisori extends Prodotto {
	private int dimensioni;
	private Boolean smart;

	public Televisori(String nome, String marca, float prezzo, int dimensioni) {
		super(nome, marca, prezzo);
		this.dimensioni = dimensioni;
		this.smart = isSmart();
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public Boolean getSmart() {
		return smart;
	}

	public void setSmart(Boolean smart) {
		this.smart = smart;
	}

	private boolean isSmart() {

		if (this.dimensioni <= 60) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + " Dimensione: " + dimensioni + " modello:  " + smart;

	}

}

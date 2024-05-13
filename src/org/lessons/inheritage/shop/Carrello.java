package org.lessons.inheritage.shop;
import java.util.Scanner;

public class Carrello {
	
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("inserisci il tuo artiolo preferito nel carrello tra: Smartphone, Televisore; Cuffie");
		
		
		String prodottoPreferito = input.nextLine();
		
		
Prodotto prodottoNelCarrello = null;
		
		switch(prodottoPreferito) {
			case "Smartphone":
				prodottoNelCarrello = new Smartphone("Apple", "iphone13",1100, "128GB");
				break;
			case "Televisore":
				prodottoNelCarrello = new Televisori("tvs-898","Hp", 566, 40);
				
				break;
			case "Cuffie":
				prodottoNelCarrello = new Cuffie("boh-nonso455", "xiaomi", 80, "bianche","wireless" );
				break;
			default:
				System.out.println("Inserimento non corretto");
				
		}
		
		System.out.println(prodottoNelCarrello);
		
		

	}
	
	
	
	
	
	
}

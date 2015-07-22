/*
 * FINAL serve per
 * dichiarare costanti
 * metodi non riscrivibili
 * classi non ereditabili
 */

/*
 * All'interno di un metodo statico possiamo passre solo variabili statiche e non variabili di istanza
 * 
 */
class Esempio {
	
	
	public static int x = 10;

//	public static final int y = 10;    se dichiaro una variabile final poi non posso più modificarne il valore
//	y += 2;
	
	/*
	 * METODO FINAL
	 * un Metodo FINAL non può essere riscritto quindi non può essere fatto l'Override
	 */
	
	/*
	 * CLASSE FINAL
	 * una Classe FINAL non può essere estesa quindi non può essere ereditata
	 */
	

	public Esempio() { // costruttore
		System.out.println("Costruttore");
	}

	/*
	 * Inizializzatore Statico 
	 * Ha la caratteristica di essere eseguito e
	 * caricato in memoria prima del costruttore
	 */

	static {
		System.out.println("Inizializzatore Statico");       // Vengono stampati prima gli inizializzatori del costruttore
	}
	
	 /* Inizializzatore Statico 
	 * Ha la caratteristica di essere eseguito e
	 * caricato in memoria prima del costruttore
	 */

	 {
		System.out.println("Inizializzatore di Istanza");    // Vengono stampati prima gli inizializzatori del costruttore
	}
}

public class mainClass {
	public static void main(String[] args) {
		Esempio e = new Esempio();
	}
}

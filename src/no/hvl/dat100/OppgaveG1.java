package no.hvl.dat100;

public class OppgaveG1 {

	public static void main(String[] args) {

		// a) Legg inn en tabell med heltal
		int[] tabell = { 1, 3, 4, 7, 9, 10 };

		// b) Skriv ut innholdet på posisjon 2
		System.out.println("Verdi på posisjon 2: " + tabell[2]);

		// c) Endre innholdet på posisjon 2 fra 4 til 7
		tabell[2] = 7;
		System.out.println("Ny verdi på posisjon 2: " + tabell[2]);

		// d) Skriv ut innholdet av tabellen med for-løkke

		// for (int i = 0; i < tabell.length; i++) {
		// System.out.print(tabell[i] + " ");

		// e) Kall skrivUt-metoden
		skrivUt(tabell);
		System.out.println(finnes(tabell, 7));
		System.out.println(finnes(tabell, 7));
		int[] nytabell = skiftfortegn(tabell);
		skrivUt(nytabell);
		
	}

// e) fyttet koden utenfor main metoden
	public static void skrivUt(int[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}

	}
	// g) Finnes i tabellen metode
	public static boolean finnes(int[] tabell, int tall) {
		int i = 0;
		while (i < tabell.length) {
			if (tabell[i] == tall) {
				return true;
			}
			i++;
		}
		return false;
	}
	
	// h) metode for skifte fortegn på alle verdier i tabellen
	public static int[] skiftfortegn(int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = -tabell[i];
			
		}
		return nyTabell;
	}
}

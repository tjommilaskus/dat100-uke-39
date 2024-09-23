package no.hvl.dat100;

public class OppgaveG2 {

	public static void main(String[] args) {

		double[][] obs = { { 1.4, 1.7, 1.9, 2.0 }, { 5.4, 7.8, 9.8, 7.9, 3.0 }, { -1.7, -1.7, -2.8 } };
		skrivUt(obs);
		skrivUtUtvidet(obs);

		

	}

	public static void skrivUt(double[][] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			for (int j = 0; j < tabell[i].length; j++) {
				System.out.print(tabell[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void skrivUtUtvidet(double[][] tabell) {
		for (double[] rad : tabell) {
			for (double verdi : rad) {
				System.out.print(verdi + " ");
			}
			System.out.println();
		}

	}
}
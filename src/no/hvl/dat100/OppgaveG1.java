package no.hvl.dat100;

public class OppgaveG1 {

	public static void main(String[] args) {
		int[] tabell = {1, 3, 4, 7, 9, 10};
		System.out.println(tabell[2]);
		
		tabell[2] = 7;
		
		skrivUt(tabell);
		
		}
		
		public static void skrivUt(int[] tab) {
			for (int i = 0; i < tab.length; i++) {
				System.out.print(tab[i] + " ");
		}
		
	}
		
}

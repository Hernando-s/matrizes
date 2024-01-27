package selectionShort;

import java.util.Random;

public class Program5 {

	public static void main(String args[]) {
		
		int tamanhovetor = 100;
		int vetor[] = new int[tamanhovetor];
		
		Random vet = new Random();
		int aux;

		// VETOR ALEATORIO;
		System.out.println("VETOR ALEATORIO:");
		for (int i = 0; i < tamanhovetor; i++) {
			vetor[i] = vet.nextInt(100) + 1;
		}
		
		for (int i = 0; i < tamanhovetor; i++) {
			System.out.println("vetor: " + vetor[i]);
		}
		//// FIM//////////////////////////////////////////////////////////

		// METODO BOLHA;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < (vetor.length - 1); ++j) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;

				}
			}
		}
		// FIM //////////////////////////////////////////////////////

		// VETOR ORDENADO;
		System.out.println("VETOR ORDENADO: ");
		for (int i = 0; i < vetor.length; ++i) {
			System.out.println("VETOR : " + vetor[i]);

		}
		// FIM///////////////////////////////////////////
	}

}

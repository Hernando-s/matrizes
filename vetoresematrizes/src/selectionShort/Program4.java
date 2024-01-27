package selectionShort;

public class Program4 {

	public static void main(String[] args) {

		int vetor[] = { 1, 8, 9, 2, 15, 20 };

		// VETOR ORIGINAL;
		System.out.println("VETOR ORIGINAL:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("vetor: " + vetor[i]);
		}
		//////////////////////////////////////////////////////////////

		int posicao_menor = 0, aux = 0;
		int contador = 0;
		for (int i = 0; i < vetor.length; i++) {

			posicao_menor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[posicao_menor]) {
					posicao_menor = j;
					contador++;
				}

			}

			aux = vetor[posicao_menor];
			vetor[posicao_menor] = vetor[i];
			vetor[i] = aux;
		}

		// VETOR ORDENADO;
		System.out.println("VETOR ORDENADO: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("vetor: " + vetor[i]);
			/////////////////////////////////////////////////////////////////
		}
		System.out.println("TROCAS REALIZADAS: " + contador);

	}

}

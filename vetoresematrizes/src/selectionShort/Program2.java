package selectionShort;

public class Program2 {

	public static void main(String[] args) {

		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int elemento = 8;

		int posicao = buscaBinaria(vetor, elemento);

		if (posicao != -1) {
			System.out.println("Valor encontrado na posição " + posicao);

		} else {
			System.out.println("Valor não encontrado");
		}
	}

	public static int buscaBinaria(int[] vetor, int elemento) {
		int menor = 0;
		int maior = vetor.length - 1;
		int iteracoes = 0;

		while (menor <= maior) {
			iteracoes++; // contagem de iterações
			int meio = (menor + maior) / 2;

			if (vetor[meio] == elemento) {
				System.out.println("Número de iterações: " + iteracoes);
				return meio;

			} else if (vetor[meio] < elemento) {
				menor = meio + 1;
			} else {
				maior = meio - 1;
			}

		}
		return -1; // valor não encontrado
	}

}

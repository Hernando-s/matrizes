package vetores;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        //um vetor com 7 posicoes
		int[] vetor1 = { 0, 1, 2, 3, 6, 5, 2 };
		
		
		int soma1 = 0;
		for (int i = 0; i < vetor1.length; i++) {

			vetor1[i] = sc.nextInt();
			soma1 +=  + vetor1[i];
		}
	

		for (int j = 0; j < vetor1.length; j++) {

			System.out.println("[" + j + "]" + " = " + vetor1[j]);
		}
		

		
		//um vetor com 7 posicoes
				int n = 7;
				int[] vetor2 = new int[n];
				
				
		int soma2 = 0;
		for (int i = 0; i < vetor2.length; i++) {

			vetor2[i] = sc.nextInt();
			soma2 +=  + vetor2[i];
		}
	

		for (int j = 0; j < vetor2.length; j++) {

			System.out.println("[" + j + "]" + " = " + vetor2[j]);
		}
		
		
		
		//um vetor com 7 posicoes
		int[] vetor3 = new int[7];
		
		int soma3 = 0;
		for (int i = 0; i < vetor3.length; i++) {

			vetor3[i] = sc.nextInt();
			soma3 +=  + vetor3[i];
		}
	

		for (int j = 0; j < vetor3.length; j++) {

			System.out.println("[" + j + "]" + " = " + vetor3[j]);
		}
		
		System.out.println("SOMA VETOR1");
		System.out.println(soma1);
		System.out.println("SOMA VETOR2");
		System.out.println(soma2);
		System.out.println("SOMA VETOR3");
		System.out.println(soma3);

		sc.close();
	}

}

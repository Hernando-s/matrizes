package matrizes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("PREENCHA A MATRIZ:");

		System.out.println("DIGITE A QUANTIDADE DE LINHA:");
		int n = sc.nextInt();

		System.out.println("DIGITE A QUANTIDADE DE COLUNA:");
		int m = sc.nextInt();

		int mat[][] = new int[n][m];
		
  
		
		
		
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < m; j++) {
				
				mat[i][j] = sc.nextInt();
				
			}
		}
				
		for(int i = 0; i < n; i++ ) {
			for(int j = 0; j < m; j++) {
				System.out.printf("%2d |", mat[i][j]);
			}
			
			System.out.printf("%n");
		}
		
		sc.close();
	}
}

			
		
		
package matrizes;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("PREENCHA A MATRIZ:");

		int n = 5;
		int m = 5;

		int mat[][] = new int[n][m];
		
       int cont = 1;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < m; j++) {
				
				mat[i][j] = cont++;
				
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

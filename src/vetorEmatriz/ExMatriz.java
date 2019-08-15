package vetorEmatriz;

import java.util.Scanner;

public class ExMatriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		final int LINHAS = 3;
		final int COLUNAS = 3;
		
		int matriz[][] = new int[LINHAS][COLUNAS];
		
		for (int lin = 0; lin < LINHAS; lin++){
			for (int col = 0; col < COLUNAS; col++){
				matriz[lin][col] = entrada.nextInt();
			}
		}
		
		for (int lin = 0; lin < LINHAS; lin++){
			for (int col = 0; col < COLUNAS; col++){
				System.out.print(matriz[lin][col] + "\t");
			}
			System.out.println();
		}
		

	}

}

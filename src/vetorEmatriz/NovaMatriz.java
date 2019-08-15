package vetorEmatriz;

import java.util.Scanner;

public class NovaMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int COLUNAS = 3;
		final int LINHAS = 3;
		int soma = 0;
		float media = 0;
		int maior = 0;
		int menor = 0;
		
		int[][] matriz = new int[LINHAS][COLUNAS];
		
		
		System.out.println("\nMatriz Original");
		for (int lin = 0; lin < LINHAS; lin++){
			System.out.println();
			for (int col = 0; col < COLUNAS; col++){
				System.out.print(matriz[lin][col] + "\t");
			}
		}
		
		for (int lin = 0; lin < LINHAS; lin++){
			for (int col = 0; col < COLUNAS; col++){
				System.out.print("Informe um valor: ");
				matriz[lin][col] = entrada.nextInt();
				soma = soma + matriz[lin][col];
				if ((lin == 0) && (col == 0)){
					maior = matriz[lin][col];
					menor = matriz[lin][col];
				}else{
					if (maior < matriz[lin][col])
						maior = matriz[lin][col];
					if (menor > matriz[lin][col])
						menor = matriz[lin][col];
				}
			}
		}
		
		media = soma / (float)(LINHAS * COLUNAS);

		System.out.println("\nMatriz Original");
		for (int lin = 0; lin < LINHAS; lin++){
			System.out.println();
			for (int col = 0; col < COLUNAS; col++){
				System.out.print(matriz[lin][col] + "\t");
			}
		}
		
		System.out.println("\nMaior: " + maior);
		System.out.println("\nMenor: " + menor);
		System.out.println("\nSoma: " + soma);
		System.out.println("\nMédia: " + media);
		
		System.out.println("\nMatriz marcando os Pares");
		for (int lin = 0; lin < LINHAS; lin++){
			System.out.println();
			for (int col = 0; col < COLUNAS; col++){
				if (matriz[lin][col] % 2 == 0)
					System.out.print(matriz[lin][col] + "*\t");
				else
					System.out.print(matriz[lin][col] + "\t");
			}
		}
		
		System.out.println("\nMatriz marcando os Impares");
		for (int lin = 0; lin < LINHAS; lin++){
			System.out.println();
			for (int col = 0; col < COLUNAS; col++){
				if (matriz[lin][col] % 2 != 0)
					System.out.print(matriz[lin][col] + "*\t");
				else
					System.out.print(matriz[lin][col] + "\t");
			}
		}
		
		System.out.println("\nMatriz marcando os abaixo da média");
		for (int lin = 0; lin < LINHAS; lin++){
			System.out.println();
			for (int col = 0; col < COLUNAS; col++){
				if (matriz[lin][col] < media)
					System.out.print(matriz[lin][col] + "*\t");
				else
					System.out.print(matriz[lin][col] + "\t");
			}
		}
		
		System.out.println("\nMatriz marcando os acima da média");
		for (int lin = 0; lin < LINHAS; lin++){
			System.out.println();
			for (int col = 0; col < COLUNAS; col++){
				if (matriz[lin][col] > media)
					System.out.print(matriz[lin][col] + "*\t");
				else
					System.out.print(matriz[lin][col] + "\t");
			}
		}
		

	}

}

package vetorEmatriz;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int linhas = 3;
		final int colunas = 3;
		int matriz[][] = new int[linhas][colunas];
		float soma = 0, media = 0;
		int maior = 0, menor = 0;
		
		for (int lin = 0; lin < linhas; lin++){
			for (int col = 0; col < colunas; col++){
				System.out.print("Informe um número: ");
				matriz[lin][col] = entrada.nextInt();
				soma = soma + matriz[lin][col];
				if ((lin == 0)&&(col == 0)){
					maior = matriz[lin][col];
					menor = matriz[lin][col];
				}
				else{
					if (maior < matriz[lin][col])
						maior = matriz[lin][col];
					if (menor > matriz[lin][col])
						menor = matriz[lin][col];
				}
				
			}
		}
		
		media = soma / (linhas * colunas);
			
		for (int lin = 0; lin < linhas; lin++){
			System.out.println();
			for (int col = 0; col < colunas; col++)
				System.out.print(matriz[lin][col] + "  ");
		}
		
		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
}
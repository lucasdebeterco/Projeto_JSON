package vetorEmatriz;

import java.util.Scanner;

// soma, média, maior, menor, par, impar

public class VetorValidação {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		final int MENOR = 0;
		final int MAIOR = 20;
		
		int[] vetor = new int[TAM];
		
		for (int x = 0; x < TAM; x++){
			do{
				System.out.print((x + 1) + "--> ");
				vetor[x] = entrada.nextInt();
				if ((vetor[x] < MENOR) || (vetor[x] > MAIOR))
					System.out.println("Informe valores entre 0 e 20");
			}while((vetor[x] < MENOR) || (vetor[x] > MAIOR));
		}	
		
		for (int x = 0; x < TAM; x++){
			System.out.print(vetor[x] +":");
			for (int y = 0; y < vetor[x]; y++)
				System.out.print("#");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
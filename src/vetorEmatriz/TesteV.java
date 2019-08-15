package vetorEmatriz;

import java.util.Scanner;

public class TesteV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int soma = 0;
		float media = 0;
		
		int vetor[] = new int[TAM];
		
		for (int x = 0; x < TAM; x++){
			System.out.print("--> ");
			vetor[x] = entrada.nextInt();
			soma = soma + vetor[x];
			// soma += vetor[x];
		}
		
		for (int x = 0; x < TAM; x++){
			System.out.println(x + " --> " + vetor[x]);
		}
		
		media = soma / (float)TAM;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
		

	}

}

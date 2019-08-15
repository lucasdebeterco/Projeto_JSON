package vetorEmatriz;

import java.util.Scanner;

// soma, média, maior, menor, par, impar

public class Vetor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int soma = 0;
		float media = 0;
		final int DIV = 2;
		int par = 0;
		int impar = 0;
		int maior = 0;
		int menor = 0;
		
		int[] vetor = new int[TAM];
		
		for (int x = 0; x < TAM; x++){
			System.out.print((x + 1) + "--> ");
			vetor[x] = entrada.nextInt();
			// par e impar
			if (vetor[x] % DIV == 0)
				par++;
			else
				impar++;
			
			// maior e menor
			if (x == 0){
				maior = vetor[x];
				menor = vetor[x];
			}else{
				if (maior < vetor[x])
					maior = vetor[x];
				if (menor > vetor[x])
					menor = vetor[x];
			}
			
			// soma
			soma = soma + vetor[x];
		}
		
		media = soma / (float)TAM;
		
		for (int x = 0; x < TAM; x++){
			System.out.print(vetor[x] + " | ");
		}
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Par: " + par);
		System.out.println("Ímpar: " + impar);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		
		
		
		
		
		
		
		
		
		
	}
}
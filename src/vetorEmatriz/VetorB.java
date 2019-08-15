package vetorEmatriz;

import java.util.Scanner;

public class VetorB {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int tamanho = 0;
		
		do{
			System.out.print("Informe o tamanho do vetor: ");
			tamanho = entrada.nextInt();
			if (tamanho <= 0)
				System.out.println("Tamanho do vetor deve ser maior que zero.");
		}while(tamanho <= 0);
		
		final int TAM = tamanho;
		int soma = 0;
		float media = 0;
		int maior = 0;
		int menor = 0;
		int cPar = 0;
		int cImpar = 0;
		
		int[] vetor = new int[TAM];
		
		for (int x = 0; x < TAM; x++){
			System.out.print("Informe um número: ");
			vetor[x] = entrada.nextInt();
			soma = soma + vetor[x];
			if (vetor[x] % 2 == 0)
				cPar++;
			else
				cImpar++;
			if (x == 0){
				maior = vetor[x];
				menor = vetor[x];
			}else{
				if (maior < vetor[x])
					maior = vetor[x];
				if (menor > vetor[x])
					menor = vetor[x];
			}
		}
		media = soma / (float)TAM;
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.print("Par: " + cPar + " --> ");
		for (int x = 0; x < TAM; x++){
			if (vetor[x] % 2 == 0)
				System.out.print(vetor[x] + " | ");
		}
		System.out.print("\nÍmpar: " + cImpar + " --> ");
		for (int x = 0; x < TAM; x++){
			if (vetor[x] % 2 != 0)
				System.out.print(vetor[x] + " | ");
		}
		System.out.println("\nOrdem Original");
		for (int x = 0; x < TAM; x++){
			System.out.print(vetor[x] + " | ");
		}
		
		System.out.println("\nOrdem Inversa");
		for (int x = TAM - 1; x >= 0; x--){
			System.out.print(vetor[x] + " | ");
		}
		
	}
}
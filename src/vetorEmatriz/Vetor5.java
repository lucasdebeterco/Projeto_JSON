package vetorEmatriz;

import java.util.Scanner;

public class Vetor5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		
		final int tamanho = 5;
		double soma = 0, media = 0;
		int maior = 0, menor = 0;
		int vetorI[] = new int[tamanho];
		
		for (int x = 0; x < tamanho; x++){
			System.out.print("Informe um número: ");
			vetorI[x] = entrada.nextInt();
			soma = soma + vetorI[x];
			if (x == 0){
				maior = vetorI[x];
				menor = vetorI[x];
			}else{
				if (maior < vetorI[x])
					maior = vetorI[x];
				if (menor > vetorI[x])
					menor = vetorI[x];
			}
		}
		
		media = soma / tamanho;
		
		System.out.println("\nNúmeros na ordem de digitação");
		for (int x = 0; x < tamanho; x++){
			System.out.print(vetorI[x] + "  ");
		}
		
		System.out.println("\n\nNúmeros na ordem invertida");
		for (int x = tamanho -1; x >= 0; x--){
			System.out.print(vetorI[x] + "  ");
		}
		
		System.out.println("\n\nSoma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
	}
}
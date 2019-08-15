package repeticao;

import java.util.Scanner;

public class Ex1While {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tamanho do vetor: ");
		int vtam = entrada.nextInt();
		
		final int TAM = vtam;
		
		int[] vetor = new int[TAM];
		
		for (int x = 0; x < TAM; x++){
			System.out.print("Informe um número: ");
			
			vetor[x] = entrada.nextInt();
			
		}
		
		
		
		for (int x = 0; x < TAM; x++){
			System.out.println(vetor[x]);
		}
		System.out.println("");
		for (int x = TAM - 1; x >= 0; x--){
			System.out.println(vetor[x]);
		}
		
		
	}
}
package repeticao;

import java.util.Scanner;

public class ExWHILE {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		int numero = 11;
		
		while((numero > 10) || (numero < 0)){
			System.out.print("Informe um número: ");
			numero = entrada.nextInt();
		}
		
	}
}
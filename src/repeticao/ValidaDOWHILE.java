package repeticao;

import java.util.Scanner;

public class ValidaDOWHILE {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		do{
			System.out.print("Informe um n�mero: ");
			numero = entrada.nextInt();
			if ((numero > 10) || (numero < 0))
				System.out.println("Valor Inv�lido");
		}while((numero > 10) || (numero < 0));

	}

}

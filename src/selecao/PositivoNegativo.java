package selecao;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Informe um n�mero: ");
		num = entrada.nextInt();
		
		if (num > 0)
			System.out.println(num + " � Positivo");
		else{
			if (num < 0)
				System.out.println(num + " � Negativo");
			else
				System.out.println("Zero");
		}
		
	}

}

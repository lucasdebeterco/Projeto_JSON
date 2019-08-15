package selecao;

import java.util.Scanner;

public class MascFemString {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String sexo;
		
		System.out.print("Informe o sexo f/F m/M: ");
		sexo = entrada.nextLine();
		
		if ("a".equalsIgnoreCase(sexo))
			System.out.println("Sexo Feminino");
		
		if ("m".equalsIgnoreCase(sexo))
			System.out.println("Sexo Masculino");
		

	}

}

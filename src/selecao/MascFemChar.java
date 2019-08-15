package selecao;

import java.util.Scanner;

public class MascFemChar {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		char sexo;
		
		System.out.print("Informe o sexo (m/M f/F): ");
		sexo = entrada.nextLine().charAt(0);
		
		if ((sexo == 'a') || (sexo == 'e'))
			System.out.println("Sexo Feminino");
		
		if ((sexo == 'm') || (sexo == 'M'))
			System.out.println("Sexo Masculino");

	}

}

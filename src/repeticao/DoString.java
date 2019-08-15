package repeticao;

import java.util.Scanner;

public class DoString {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String nome, sexoS;
		char sexoC;
		
		
		do{
			System.out.print("Informe o nome: ");
			nome = entrada.nextLine();
			if (nome.length() <= 3)
				System.out.println("Nome deve ter mais de 3 caracteres");
		}while(nome.length() <= 3);

		
		do{
			System.out.print("Informe o sexo (char): ");
			sexoC = entrada.nextLine().charAt(0);
			if ((sexoC != 'f') && (sexoC != 'm'))
				System.out.println("Informe somente f/m");
		}while((sexoC != 'f') && (sexoC != 'm'));
		
		do{
			System.out.print("Informe o sexo (String): ");
			sexoS = entrada.nextLine();
		}while((!"f".equalsIgnoreCase(sexoS)) && (!"m".equalsIgnoreCase(sexoS)));
		
	
	}

}

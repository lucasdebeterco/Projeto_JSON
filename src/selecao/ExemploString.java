package selecao;

import java.util.Scanner;

public class ExemploString {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String senha = "A1B2", digitado;
		
		System.out.print("Informe a senha: ");
		digitado = entrada.nextLine();
		
		if (senha.equals(digitado))
			System.out.println("Bem Vindo");
		
		if (!senha.equals(digitado))
			System.out.println("Senha Inválida");
		
	}

}

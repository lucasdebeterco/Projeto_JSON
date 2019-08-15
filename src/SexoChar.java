import java.util.Scanner;

public class SexoChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		char sexo = ' ';
		
		System.out.print("Informe seu sexo (F - Feminino / M - Masculino): ");
		sexo = entrada.nextLine().toLowerCase().charAt(0);
		
		if (sexo == 'f')
			System.out.println("Feminino");
		else
			if (sexo == 'm')
				System.out.println("Masculino");
			else
				System.out.println("Erro.....");
		
		

	}

}

import java.util.Scanner;

public class SexoString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String sexo = " ";
		
		System.out.print("Informe seu sexo (F - Feminino / M - Masculino): ");
		sexo = entrada.nextLine();
		
		if (sexo.equalsIgnoreCase("f"))
			System.out.println("Feminino");
		else
			if (sexo.equalsIgnoreCase("m"))
				System.out.println("Masculino");
			else
				System.out.println("Erro.....");
		
		

	}

}

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String msg = "";
				
		System.out.print("\n\nInforme o número correspondente ao dia da semana (Exemplo: 1 para Domingo): ");
		int diaSemana = entrada.nextInt();
		
		switch (diaSemana) {
			case 1: msg = "Domingo";
					break;
			case 2: msg = "Segunda-Feira";
					break;
			case 3: msg = "Terça-Feira";
					break;
			case 4: msg = "Quarta-Feira";
					break;
			case 5: msg = "Quinta-Feira";
					break;
			case 6: msg = "Sexta-Feira";
					break;
			case 7: msg = "Sábado";
					break;
			default:msg = "Houve um Erro . . .";
					break;
		}
		System.out.println("O dia da semana escolhido foi: " + msg);
		
	}
}
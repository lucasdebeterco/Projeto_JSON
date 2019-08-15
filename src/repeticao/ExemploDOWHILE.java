package repeticao;
import java.util.Scanner;

public class ExemploDOWHILE {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String resposta; 
		
		do{
			System.out.print("Deseja Sair do Programa (S - SIM / n - NAO): ");
			resposta = entrada.nextLine();
			if (!"s".equalsIgnoreCase(resposta)&&(!"n".equalsIgnoreCase(resposta))){
				System.out.println("Resposta Invalida . . . Digite Novamente . . .");
			}
		}while(!"s".equalsIgnoreCase(resposta));
		
		System.out.println("\n\nObrigado por utilizar nosso software.");
	}
}

package repeticao;
import java.util.Scanner;

public class ExemploWHILE {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite \"EU TE AMO\" para sair: ");
		String respostaNamorado = entrada.nextLine();
		while(!"eu te amo".equalsIgnoreCase(respostaNamorado)){
			System.out.print("Enquanto não digitar EU TE AMO você não sai . . . ");
			respostaNamorado = entrada.nextLine();
		}
		System.out.println("\nEu tinha certeza que voce me amava... ");
		

	}

}

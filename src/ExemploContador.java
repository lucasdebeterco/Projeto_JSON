import java.util.Scanner;

public class ExemploContador {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String resp;
		int contador = 0;
		
		do{
			System.out.print("Deseja Continuar: ");
			resp = entrada.nextLine();
			if ("sim".equalsIgnoreCase(resp)){
				contador = contador + 1;
				//contador++;
			}
		}while("sim".equalsIgnoreCase(resp));
		System.out.println("Você respondeu SIM " + contador + " vezes.");
	}

}

package selecao;
import java.util.Scanner;

public class ExemploIF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Verificar se Valor digitado é positivo ou negativo: ");
		
		int numero = entrada.nextInt();
		
		if (numero > 0){
			System.out.println("Número positivo");
		}
		
		if (numero < 0){
			System.out.println("Número negativo");
		}
		
		if (numero == 0){
			System.out.println("Você digitou zero");
		}
		
	}

}
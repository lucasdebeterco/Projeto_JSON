package selecao;
import java.util.Scanner;

public class ExemploIF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Verificar se Valor digitado � positivo ou negativo: ");
		
		int numero = entrada.nextInt();
		
		if (numero > 0){
			System.out.println("N�mero positivo");
		}
		
		if (numero < 0){
			System.out.println("N�mero negativo");
		}
		
		if (numero == 0){
			System.out.println("Voc� digitou zero");
		}
		
	}

}
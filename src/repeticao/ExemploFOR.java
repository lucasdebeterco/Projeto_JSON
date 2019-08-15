package repeticao;
import java.util.Scanner;


public class ExemploFOR {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas vezes você quer mostrar a mensagem Ola Mundo: ");
		int total = entrada.nextInt();
		
		for (int i = 0; i < total; i++){
			System.out.println("Ola Mundo");
		}
		
		// FOR mostrando a contagem da variável "i" forma crescente
		System.out.println("\nOrdem Crescente");
		for (int i = 0; i < total; i++){
			System.out.println(i);
		}
		
		// FOR mostrando a contagem da variável "i" forma decrescente
		System.out.println("\nOrdem Decrescente");
		for (int i = (total-1); i >= 0; i--){
			System.out.println(i);
		}
		
	}

}

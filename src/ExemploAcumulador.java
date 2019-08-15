import java.util.Scanner;

public class ExemploAcumulador {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero1 = 0, soma = 0;
		
		do{
			System.out.print("Digite um número inteiro para somar (- 1 para sair): ");
			numero1 = entrada.nextInt();
			if (numero1 != -1){
				soma = soma + numero1;
			}
		}while(numero1 != -1);
		System.out.println("A soma dos números digitados foi: " + soma);

	}

}

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, soma;
		
		System.out.print("Informe o primeiro n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.print("Informe o segundo n�mero: ");
		n2 = entrada.nextInt();
		
		soma = n1 + n2;
		
		System.out.println(n1 + " + " + n2 + " = " + soma);
		
	}

}

import java.util.Scanner;

public class NovoTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int n1 = 0, n2 = 0;

		System.out.print("Informe o primeiro número: ");
		n1 = entrada.nextInt();

		System.out.print("Informe o segundo número: ");
		n2 = entrada.nextInt();

		if ((n1 > n2) && (n1 % 2 == 0)){
		   System.out.println(n1);
		}

		if (n2 > n1){
		   System.out.println(n2);
		}

		if (n1 == n2){
		   System.out.println("Os números são iguais."); 
		}
		
		

	}

}

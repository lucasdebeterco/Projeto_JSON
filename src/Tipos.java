import java.util.Scanner;

public class Tipos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = 10;
		float altura = (float)23.34;
		double salario = 1000.123;
		char letra = 'a';
		boolean teste = true;
		String texto = "Rodrigo Curvêllo";
		
		System.out.print("Informe um número(int): ");
		num = entrada.nextInt();
		
		System.out.print("Informe um número(float): ");
		altura = entrada.nextFloat();
		
		System.out.print("Informe um número(double): ");
		salario = entrada.nextDouble();
		
		entrada.nextLine();
		System.out.print("Informe um texto(String): ");
		texto = entrada.nextLine();
		
		System.out.println("int: " + num);
		System.out.println("float: " + altura);
		System.out.println("double: " + salario);
		System.out.println("char: " + letra);
		System.out.println("boolean: " + teste);
		System.out.println("String: " + texto);

	}

}

import java.util.Scanner;

public class Maior3Numeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int a = 0, b = 0, c =0;
		
		System.out.print("Informe o primeiro número: ");
		a = entrada.nextInt();
		
		System.out.print("Informe o segundo número: ");
		b = entrada.nextInt();
		
		System.out.print("Informe o terceiro número: ");
		c = entrada.nextInt();
		
		
		if ((a != b) && (b != c) && (a != c)){
			
			//System.out.println("Diferentes");
			if ((a > b) && (b > c))
				System.out.println(a + " > " + b + " > " + c);
			
			if ((a > c) && (c > b))
				System.out.println(a + " > " + c + " > " + b);
			
			if ((b > a) && (a > c))
				System.out.println(b + " > " + a + " > " + c);

			if ((b > c) && (c > a))
				System.out.println(b + " > " + c + " > " + a);
			
			if ((c > a) && (a > b))
				System.out.println(c + " > " + a + " > " + b);
			
			if ((c > b) && (b > a))
				System.out.println(c + " > " + b + " > " + a);
		}
		
		if ((a == b) || (b == c) || (a == c)){
			//System.out.println("Iguais");
			
			if ((a == b) && (b == c))
				System.out.println(a + " = " + b + " = " + c);
		}

	}

}

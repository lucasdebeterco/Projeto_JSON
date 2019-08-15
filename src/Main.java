import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
	
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		double raio = entrada.nextFloat();
		DecimalFormat casas = new DecimalFormat ("0.0000");
		final double PI = 3.14159;
		double area = PI * raio * raio;
		String saida = casas.format(area);
		saida = saida.replace(",",".");
		System.out.println("A="+saida);
	}
}

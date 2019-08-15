import java.text.DecimalFormat;

public class FuncoesMatematicas {

	public static void main(String[] args) {
		
		float num1 = (float)12.1;
		double num2 = 25.12345;
		
		System.out.println(num1 + " Arredondado para cima é: " + Math.ceil(num1));
		System.out.println(num1 + " Arredondado para baixo é: " + Math.floor(num1));
		
		System.out.println(num2 + " Arredondado para cima é: " + Math.ceil(num2));
		System.out.println(num2 + " Arredondado para baixo é: " + Math.floor(num2));
		
		System.out.println("O valor original de num1 é: " + num1);
		System.out.println("O valor original de num2 é: " + num2);
		
		/* Define o número de casas decimais que deve ser mostrado na saida. */
		DecimalFormat casas = new DecimalFormat ("0.00");
		System.out.println(num2 + " Com duas casas decimais é : " + casas.format(num2));
		
		/* Raiz Quadrada */
		System.out.println("A raiz quadrada de 9 é " + Math.sqrt(9));
						
		/* Retorna o maior de 2 números */
		System.out.println("O maior número entre 1 e 2 é :" + Math.max(1, 2));
		
		/* Retorna o menor de 2 números */
		System.out.println("O menor número entre 1 e 2 é :" + Math.min(1, 2));
		
		/* mod resto da divisão */
		System.out.println("O resto da divisão de 7 por 5 é " + 7 % 5);
		
		/* div inteiro da divisão */
		System.out.println("O div, inteiro da divisão de 7 por 3 é " + (int)(7/3));
		
		/* Retorna o valor absoluto */
		System.out.println("O valor absoluto de -121 é :" + Math.abs(-121));
		
		/* Exponenciação */
		System.out.println("2 elevado a 7 é :" + Math.pow(2,7));
		
		/* Gerando numeros aleatórios */
		System.out.println("Gerando um número aleatório de 0 a 10 :" + (int)(Math.random()*11));
		
		double numF1 = 3.127719283127391823;
		System.out.printf("%.2f",numF1);
		String saida1 = casas.format(numF1).replace(",",".");
		System.out.printf("\n" + casas.format(numF1));
		System.out.println("\n" + saida1);
	}
}
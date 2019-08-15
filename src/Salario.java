import java.util.Scanner;

public class Salario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		float valorHora = 0;
		float horasTrabalhadas = 0;
		double salario = 0;
		double salarioNovo = 0;
		float aumento = 0;
		double valorAumento = 0;
		final float F1 = 280;
		final float F2 = 700;
		final float F3 = 1500;
		final float P1 = (float)0.2;
		final float P2 = (float)0.15;
		final float P3 = (float)0.1;
		final float P4 = (float)0.05;
		
		System.out.print("Informe o valor hora: ");
		valorHora = entrada.nextFloat();
		
		System.out.print("Informe as horas trabalhadas (mês): ");
		horasTrabalhadas = entrada.nextFloat();
		
		salario = valorHora * horasTrabalhadas;
		
		if (salario <= F1)
			aumento = P1;
		else
			if (salario <= F2)
				aumento = P2;
			else
				if (salario <= F3)
					aumento = P3;
				else
					aumento = P4;
		
		valorAumento = salario * aumento;
		
		salarioNovo = salario + valorAumento;
		
		System.out.println(":::... FOLHA DE PAGAMENTO ...:::");
		System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
		System.out.println("Valor Hora: R$ " + valorHora);
		System.out.println("Salário Inicial: R$ " + salario);
		System.out.println("Percentual de Aumento: " + (aumento * 100) + "%");
		System.out.println("Valor Aumento: R$ " + valorAumento);
		System.out.println("Salário Atual: R$ " + salarioNovo);
		
	}

}

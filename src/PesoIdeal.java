import java.util.Scanner;

public class PesoIdeal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		float altura = 0;
		float peso = 0;
		char sexo = ' ';
		float pesoIdeal = 0;
		String mSexo = "Masculino";

		System.out.print("Informe seu sexo (F - Feminino / M - Masculino): ");
		sexo = entrada.nextLine().toLowerCase().charAt(0);

		if ((sexo == 'f') || (sexo == 'm')) {
			System.out.print("Informe seu peso: ");
			peso = entrada.nextFloat();
			if (peso > 0) {
				System.out.print("Informe sua altura: ");
				altura = entrada.nextFloat();
				if (altura > 0) {
					if (sexo == 'f') {
						mSexo = "Feminino";
						pesoIdeal = (float) ((62.1 * altura) - 44.7);
					} else
						pesoIdeal = (float) ((72.7 * altura) - 58);
					System.out.println("Altura: " + altura);
					System.out.println("Peso: " + peso);
					System.out.println("Sexo: " + mSexo);
					System.out.println("Peso Ideal: " + pesoIdeal);
					if (peso > pesoIdeal)
						System.out.println("Acima do peso ideal");
					else if (peso < pesoIdeal)
						System.out.println("Abaixo do peso ideal");
					else
						System.out.println("Dentro do peso ideal");
				} else
					System.out.println("Erro ao informar a altura");
			} else
				System.out.println("Erro ao informar o peso");
		} else
			System.out.println("Erro ao informar o sexo");
	}
}
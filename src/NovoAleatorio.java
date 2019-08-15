import java.util.Random;

public class NovoAleatorio {

	public static void main(String[] args) {
		Random generator = new Random();
		int inicio = 11;
		int fim = 13;
		// Gera um número aleatório de 1 a 3 (1 ou 2 ou 3)
		int numeroAleatorio = generator.nextInt(fim-inicio+1) + inicio;
		//int numeroAleatorio = generator.nextInt(3);
		System.out.println(numeroAleatorio);
	}
}

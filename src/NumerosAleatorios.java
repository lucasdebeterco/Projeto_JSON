
import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		
		// Gerador de n�meros
		Random generator = new Random();
		for (int x = 0; x < 6; x++){
			// O par�metro 60 indica que ser�o gerados n�meros de 0 a 60
			int numeroAleatorio = generator.nextInt(61);
			System.out.println(numeroAleatorio);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

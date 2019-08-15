import java.util.*;

public class PausaDeExecucao {

	public static void main(String[] args) {
		
		int pausa = 2000;
		
		/* Deve estar no bloco protegido pois a interrup��o pode 
		 * n�o acontecer
		 */
		try {
			/* Gera a pausa, o par�metro est� em milisegundos
			 * no exemplo 5000 s�o 5 segundos.
			 * 1 Minuto = 1000 * 60
			 * 1 Hora = 1000 * 60 * 60
			 */
			System.out.println("Come�ou");
			Thread.sleep(5000);
			System.out.println("Terminou");
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}
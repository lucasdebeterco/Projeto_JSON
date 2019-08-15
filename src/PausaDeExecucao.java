import java.util.*;

public class PausaDeExecucao {

	public static void main(String[] args) {
		
		int pausa = 2000;
		
		/* Deve estar no bloco protegido pois a interrupção pode 
		 * não acontecer
		 */
		try {
			/* Gera a pausa, o parâmetro está em milisegundos
			 * no exemplo 5000 são 5 segundos.
			 * 1 Minuto = 1000 * 60
			 * 1 Hora = 1000 * 60 * 60
			 */
			System.out.println("Começou");
			Thread.sleep(5000);
			System.out.println("Terminou");
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}
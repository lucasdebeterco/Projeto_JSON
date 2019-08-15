/*
 * Created on 15/05/2006
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

/**
 * @author rodrigo
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

public class TrabalhandoString {

	public static void main(String[] args) {
		
		// Utilizada para armazenar o tamanho do vetor
		int tamanho = 0;
		
		// Numero utilizado como exemplo
		int num = 987654321;
		
		// Converter para String
		String Snum = String.valueOf(num);
		
		// Verifica o tamanho da String
		tamanho = Snum.length();
		
		// Cria um vetor(objeto) do Tipo Inteiro já com o tamanho certo
		int[] listaNum = new int[tamanho];
		
		// Colocando os números em suas posições no vetor (substring) já convertendo para inteiro
		for (int x = 0; x < tamanho; x++){
			listaNum[x] = Integer.parseInt(Snum.substring(x,x+1));
		}
		
		// Mostrando na tela, separado
		for (int x = 0; x < tamanho; x++){
			System.out.println(listaNum[x]);
		}
			
	}
}

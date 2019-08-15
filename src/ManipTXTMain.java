import java.util.Vector;
import java.util.Scanner;

public class ManipTXTMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Classe criada para manipulação do arquivo 
		ManipTXT manip = new ManipTXT("teste");
		

		// Vetor com alocação dinâmica de memória
		Vector<String> v = manip.ler();
		
		// Laço para ler o que está no arquivo e colocar no vetor
		String texto = "";
		do{
			texto = entrada.nextLine();
			if (texto.length() > 0)
				v.add(texto);
		}while(texto.length() > 0);
		
		// Abre a arquivo para escrita
		manip.abrirArquivo();
		
		// Laço para escrever as linhas do arquivo
		for (int x = 0; x < v.size(); x++)
			manip.escrever(v.elementAt(x));
		
		// Fecha o arquivo
		manip.fecharArquivo();
		
		// Lê o arquivo e grava os dados no vetor
		v = manip.ler();
		
		// Mostra os dados lidos
		for (int x = 0; x < v.size(); x++){
			System.out.println(v.elementAt(x));
		}

		// Limpa o conteúdo do arquivo, apaga os dados
		//manip.limparArquivo();
		
	}
}